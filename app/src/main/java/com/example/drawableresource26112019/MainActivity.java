package com.example.drawableresource26112019;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImgClip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgClip = findViewById(R.id.imageClip);

        final ClipDrawable clipDrawable = (ClipDrawable) mImgClip.getDrawable();

        mImgClip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mImgClip.setImageLevel(clipDrawable.getLevel() + 1000);
            }
        });

    }
}
