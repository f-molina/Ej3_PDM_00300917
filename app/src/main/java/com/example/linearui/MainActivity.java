package com.example.linearui;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout one, two, three;
    int cont, cont1, cont2 =1;
    int[] red = {
            R.color.red1,
            R.color.red2,
            R.color.red3
    };

    int[] green = {
            R.color.green1,
            R.color.green2,
            R.color.green3
    };

    int[] blue = {
            R.color.blue1,
            R.color.blue2,
            R.color.blue3
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (LinearLayout)findViewById(R.id.one);
        two = (LinearLayout)findViewById(R.id.two);
        three = (LinearLayout)findViewById(R.id.three);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                one.setBackgroundResource(red[cont]);
                cont++;
                if(cont==3){
                    cont=0;
                }

            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                two.setBackgroundResource(green[cont1]);
                cont1++;
                if(cont1==3){
                    cont1=0;
                }

            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                three.setBackgroundResource(blue[cont2]);
                cont2++;
                if(cont2==3){
                    cont2=0;
                }

            }
        });
    }
}
