package com.example.lab5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView avatarImageView;
    private EditText postalCodeEditText;

    private ActivityResultLauncher<Intent> profileLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        avatarImageView = findViewById(R.id.avatarImageView);
        postalCodeEditText = findViewById(R.id.postalCodeEditText);

        profileLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK) {
                        Intent data = result.getData();
                        if (data != null) {
                            // Corrected the default image resource to match the actual file
                            int imageID = data.getIntExtra("imageID", R.drawable.ic_avatar_picture);
                            avatarImageView.setImageResource(imageID);
                        }
                    }
                });
    }

    public void onSetAvatarButtonClick(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        profileLauncher.launch(intent);
    }

    public void onOpenInGoogleMaps(View view) {
        String postalCode = postalCodeEditText.getText().toString().trim();

        if (postalCode.isEmpty()) {
            Toast.makeText(this, "Please enter a postal code", Toast.LENGTH_SHORT).show();
            return;
        }

        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(postalCode));
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");

        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {
            Toast.makeText(this, "Google Maps is not installed", Toast.LENGTH_SHORT).show();
        }
    }
}
