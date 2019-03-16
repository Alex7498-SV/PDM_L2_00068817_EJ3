package com.alex7498.rgb;

import android.graphics.Color;
/* import android.service.autofill.FillEventHistory; */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/* import android.widget.Button; */
import android.widget.LinearLayout;

/* import static android.icu.lang.UCharacter.GraphemeClusterBreak.V; */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout b1;
    private LinearLayout b2;
    private LinearLayout b3;

    int red = 0;
    int blue = 0;
    int green = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.Red);
        b2 = findViewById(R.id.Green);
        b3 = findViewById(R.id.Blue);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId){
            case R.id.Red:
                switch (red){
                    case 0:
                        b1.setBackgroundResource(R.color.Red1);
                        red += 1;
                        break;
                    case 1:
                        b1.setBackgroundResource(R.color.Red2);
                        red += 1;
                        break;
                    case 2:
                        b1.setBackgroundResource(R.color.Red3);
                        red += 1;
                        break;
                    case 3:
                        b1.setBackgroundResource(R.color.Red4);
                        red += 1;
                        break;
                    case 4:
                        b1.setBackgroundResource(R.color.Red5);
                        red += 1;
                        break;
                    case 5:
                        b1.setBackgroundResource(R.color.Red6);
                        red = 0;
                        break;
                }
                break;
            case R.id.Green:
                switch (green) {
                    case 0:
                        b2.setBackgroundResource(R.color.Green1);
                        green += 1;
                        break;
                    case 1:
                        b2.setBackgroundResource(R.color.Green2);
                        green += 1;
                        break;
                    case 2:
                        b2.setBackgroundResource(R.color.Green3);
                        green += 1;
                        break;
                    case 3:
                        b2.setBackgroundResource(R.color.Green4);
                        green += 1;
                        break;
                    case 4:
                        b2.setBackgroundResource(R.color.Green5);
                        green += 1;
                        break;
                    case 5:
                        b2.setBackgroundResource(R.color.Green6);
                        green = 0;
                        break;
                }
                break;
            case R.id.Blue:
                switch (blue) {
                    case 0:
                        b3.setBackgroundResource(R.color.Blue1);
                        blue += 1;
                        break;
                    case 1:
                        b3.setBackgroundResource(R.color.Blue2);
                        blue += 1;
                        break;
                    case 2:
                        b3.setBackgroundResource(R.color.Blue3);
                        blue += 1;
                        break;
                    case 3:
                        b3.setBackgroundResource(R.color.Blue4);
                        blue += 1;
                        break;
                    case 4:
                        b3.setBackgroundResource(R.color.Blue5);
                        blue += 1;
                        break;
                    case 5:
                        b3.setBackgroundResource(R.color.Blue6);
                        blue = 0;
                        break;
                }
        }
    }

}
