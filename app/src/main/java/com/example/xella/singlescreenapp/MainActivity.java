package com.example.xella.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method opens a phone app and dial a phone number from contact information
     * when Call TextView s clicked.
     */
    public void dialPhoneNumber(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + getString(R.string.phone_number)));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * This method shows a message that place is saved in your list as a toast.
     *
     */
    public void markAsSaved(View view) {
        int duration = Toast.LENGTH_SHORT;
        String messageText = getString(R.string.object_title) + " is saved in your list.";
        Toast.makeText(this, messageText, duration).show();
    }

    /**
     * This method opens a web page in a browser.
     *
     */
    public void visitWebsite(View view) {
        Uri webpage = Uri.parse("http:" + getString(R.string.web_url));
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
