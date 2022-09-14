package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    boolean check = false;
    private Button btnzero;

int[] colors = new int[]{Color.MAGENTA,Color.BLUE,Color.GREEN,Color.YELLOW,Color.RED};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.textView);
        btnzero = findViewById(R.id.btnzero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));

                btnzero.setBackgroundColor(colors[mCount]);

        }
    }

    public void onClick(View arg0) {
        check = true;

        if (check == true) {

            btnzero.setBackgroundColor(Color.MAGENTA);
        }
    }
}


