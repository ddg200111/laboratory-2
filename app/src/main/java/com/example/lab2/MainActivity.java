package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView gameRules, colorName, colorText;
    Button yesButton, noButton;

    List<String> listNames = Arrays.asList("Красный", "Зеленый", "Синий", "Черный", "Пурпурный", "Голубой");
    List<Integer> listColors = Arrays.asList(Color.RED, Color.GREEN, Color.BLUE, Color.BLACK, Color.MAGENTA, Color.CYAN);

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameRules = (TextView) findViewById(R.id.game_rule);
        colorName = (TextView) findViewById(R.id.color_name);
        colorText = (TextView) findViewById(R.id.color_text);

        yesButton = (Button) findViewById(R.id.yes_button);
        noButton = (Button) findViewById(R.id.no_button);

        colorName.setText(listNames.get((int) (Math.random() * listNames.size())));
        colorName.setTextColor(listColors.get((int) (Math.random() * listColors.size())));
        colorText.setText(listNames.get((int) (Math.random() * listNames.size())));
        colorText.setTextColor(listColors.get((int) (Math.random() * listColors.size())));
    }
}