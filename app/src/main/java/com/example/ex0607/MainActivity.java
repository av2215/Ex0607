package com.example.ex0607;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int shaked1;
  ImageButton btn;
    Random ron;
    ImageView iv;
    String st;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.findViewById(R.id.btn);
        iv.findViewById(R.id.iv);
        ron=new Random();btn.findViewById(R.id.btn);
        ron=new Random();
    }

    public void go(View view) {
        shaked1 = ron.nextInt(3) + 1;
        if (shaked1 == 1) {
            iv.setImageResource(R.drawable.one);
            btn.setBackgroundResource(R.drawable.one);
        } else if (shaked1 == 2) {
            iv.setImageResource(R.drawable.two);
            btn.setBackgroundResource(R.drawable.two);
        } else {
            iv.setImageResource(R.drawable.three);
            btn.setBackgroundResource(R.drawable.three);
        }
    }
}
