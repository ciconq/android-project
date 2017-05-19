package com.example.android.snookerclub;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void browser1 (View view) {
    Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/SnookerMezdra"));
    startActivity(browserIntent);
}

    public void browser2 (View view) {
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.bg/maps/place/%D0%9A%D0%B8%D0%BD%D0%BE+%D0%A0%D0%BE%D1%8F%D0%BB/@43.1437909,23.7126384,17z/data=!3m1!4b1!4m5!3m4!1s0x40ab0364fcb91581:0x831b09df8bf0af97!8m2!3d43.143787!4d23.7148271?hl=en"));
        startActivity(browserIntent);
    }
}
