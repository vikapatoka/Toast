package com.example.toast;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void buttonClicked(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Ура! Всплывающие сообщения работают",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void button_character1(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы выбрали персонажа 1",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void button_character2(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы выбрали персонажа 2",
                Toast.LENGTH_LONG);
        myToast.show();
    }
    public void button_character3(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(),
                "Вы выбрали персонажа 3",
                Toast.LENGTH_LONG);
        myToast.show();
    }

}