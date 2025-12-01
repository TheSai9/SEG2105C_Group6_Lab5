package com.example.lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void onTeamIconSelected(View view) {
        try {
            Intent returnIntent = new Intent();

            // Get the drawable ID using the ImageView's ID mapping
            int drawableId = R.drawable.ic_avatar_picture; // default
            int viewId = view.getId();
            
            if (viewId == R.id.flag_ca) {
                drawableId = R.drawable.flag_ca;
            } else if (viewId == R.id.flag_eg) {
                drawableId = R.drawable.flag_eg;
            } else if (viewId == R.id.flag_fr) {
                drawableId = R.drawable.flag_fr;
            } else if (viewId == R.id.flag_jp) {
                drawableId = R.drawable.flag_jp;
            } else if (viewId == R.id.flag_kr) {
                drawableId = R.drawable.flag_kr;
            } else if (viewId == R.id.flag_sp) {
                drawableId = R.drawable.flag_sp;
            } else if (viewId == R.id.flag_tr) {
                drawableId = R.drawable.flag_tr;
            } else if (viewId == R.id.flag_uk) {
                drawableId = R.drawable.flag_uk;
            } else if (viewId == R.id.flag_us) {
                drawableId = R.drawable.flag_us;
            }

            returnIntent.putExtra("imageID", drawableId);
            setResult(RESULT_OK, returnIntent);
            finish();
        } catch (Exception e) {
            Log.e("ProfileActivity", "Error selecting icon", e);
        }
    }
}
