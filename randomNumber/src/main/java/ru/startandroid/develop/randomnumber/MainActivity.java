package ru.startandroid.develop.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private TextView myTextView;
    private EditText myEditText;
    private Button myButton;

    private int guess;
    private boolean gameFinished;

    public void onClick(View v){
        guess = (int)(Math.random()*100);
        gameFinished = false;
        if (!gameFinished) {
            int inp = Integer.parseInt(myEditText.getText().toString());
            if (inp > guess)
                myTextView.setText("Перелет!");
            if (inp < guess)
                myTextView.setText("Недолет");
            if (inp==guess) {
                myTextView.setText("В точку!");
                myButton.setText("Сыграть еще");
                gameFinished=true;
            }
            }
        else
        {
            guess = (int)(Math.random()*100);
            myButton.setText("Ввести значение:");
            myTextView.setText("Попробуй угадать число (1 - 100)");
            gameFinished = false;
        }
        myEditText.setText("");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextView = findViewById(R.id.tvTextView);
        myEditText = findViewById(R.id.edEditText);
        myButton = findViewById(R.id.btnButton);
    }
}