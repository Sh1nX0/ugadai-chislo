package com.example.myapplication7;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etNum1;
    Button btn;
    TextView tV1;
    TextView tV2;
    int RAN;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1 = findViewById(R.id.etNum1);
        btn = findViewById(R.id.btn);
        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        etNum1.setOnClickListener((View.OnClickListener) this);
        btn.setOnClickListener((View.OnClickListener) this);
        tV1.setOnClickListener((View.OnClickListener) this);
        tV2.setOnClickListener((View.OnClickListener) this);
        Random ran = new Random();
        RAN = ran.nextInt(100);
    }

    public void onClick(View v) {
        int num1 = 0;


        num1 = Integer.parseInt(etNum1.getText().toString());
        if (num1 > RAN) {
            tV1.setText("меньше");
            tV2.setText("");


        } else if (num1 < RAN) {
            tV1.setText("больше");
            tV2.setText("");

        } else {

            tV2.setVisibility(View.VISIBLE);
            tV2.setText("вы угадали  ");
            tV1.setText("попробуйте ещё раз");
            Random ran = new Random();
            RAN = ran.nextInt(100);

        }

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "1000");
        menu.add(0, 2, 0, "10000");
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Random ran = new Random();;
                RAN = ran.nextInt(1000);

                break;
            case 2:
                Random ban = new Random();;
                RAN = ban.nextInt(10000);

                break;

        }
        return super.onOptionsItemSelected(item);

    }
}
