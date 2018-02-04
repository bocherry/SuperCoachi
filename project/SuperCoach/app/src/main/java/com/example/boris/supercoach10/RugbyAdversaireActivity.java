package com.example.boris.supercoach10;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class RugbyAdversaireActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rugby_adversaire);

        ImageView p1 = (ImageView) findViewById(R.id.p1r);
        ImageView p2 = (ImageView) findViewById(R.id.p2r);
        ImageView p3 = (ImageView) findViewById(R.id.p3r);
        ImageView p4 = (ImageView) findViewById(R.id.p4r);
        ImageView p5 = (ImageView) findViewById(R.id.p5r);
        ImageView p6 = (ImageView) findViewById(R.id.p6r);
        ImageView p7 = (ImageView) findViewById(R.id.p7r);
        ImageView p8 = (ImageView) findViewById(R.id.p8r);
        ImageView p9 = (ImageView) findViewById(R.id.p9r);
        ImageView p10 = (ImageView) findViewById(R.id.p10r);
        ImageView p11 = (ImageView) findViewById(R.id.p11r);
        ImageView p12 = (ImageView) findViewById(R.id.p12r);
        ImageView p13 = (ImageView) findViewById(R.id.p13r);
        ImageView p14 = (ImageView) findViewById(R.id.p14r);
        ImageView p15 = (ImageView) findViewById(R.id.p15r);

        /*ImageView a1 = (ImageView) findViewById(R.id.p1r);
        ImageView a2 = (ImageView) findViewById(R.id.p2r);
        ImageView a3 = (ImageView) findViewById(R.id.p3r);
        ImageView a4 = (ImageView) findViewById(R.id.p4r);
        ImageView a5 = (ImageView) findViewById(R.id.p5r);
        ImageView a6 = (ImageView) findViewById(R.id.p6r);
        ImageView a7 = (ImageView) findViewById(R.id.p7r);
        ImageView a8 = (ImageView) findViewById(R.id.p8r);
        ImageView a9 = (ImageView) findViewById(R.id.p9r);
        ImageView a10 = (ImageView) findViewById(R.id.p10r);
        ImageView a11 = (ImageView) findViewById(R.id.p11r);
        ImageView a12 = (ImageView) findViewById(R.id.p12r);
        ImageView a13 = (ImageView) findViewById(R.id.p13r);
        ImageView a14 = (ImageView) findViewById(R.id.p14r);
        ImageView a15 = (ImageView) findViewById(R.id.p15r);*/


        p1.setOnTouchListener(onTouchListener());
        p2.setOnTouchListener(onTouchListener());
        p3.setOnTouchListener(onTouchListener());
        p4.setOnTouchListener(onTouchListener());
        p5.setOnTouchListener(onTouchListener());
        p6.setOnTouchListener(onTouchListener());
        p7.setOnTouchListener(onTouchListener());
        p8.setOnTouchListener(onTouchListener());
        p9.setOnTouchListener(onTouchListener());
        p10.setOnTouchListener(onTouchListener());
        p11.setOnTouchListener(onTouchListener());
        p12.setOnTouchListener(onTouchListener());
        p13.setOnTouchListener(onTouchListener());
        p14.setOnTouchListener(onTouchListener());
        p15.setOnTouchListener(onTouchListener());

        /*a1.setOnTouchListener(onTouchListener());
        a2.setOnTouchListener(onTouchListener());
        a3.setOnTouchListener(onTouchListener());
        a4.setOnTouchListener(onTouchListener());
        a5.setOnTouchListener(onTouchListener());
        a6.setOnTouchListener(onTouchListener());
        a7.setOnTouchListener(onTouchListener());
        a8.setOnTouchListener(onTouchListener());
        a9.setOnTouchListener(onTouchListener());
        a10.setOnTouchListener(onTouchListener());
        a11.setOnTouchListener(onTouchListener());
        a12.setOnTouchListener(onTouchListener());
        a13.setOnTouchListener(onTouchListener());
        a14.setOnTouchListener(onTouchListener());
        a15.setOnTouchListener(onTouchListener());*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.sport:
                Intent myIntent = new Intent(RugbyAdversaireActivity.this,SelectActivity.class);
                startActivity(myIntent);

            case R.id.adversaire:
                Intent hisIntent = new Intent(RugbyAdversaireActivity.this,RugbyActivity.class);
                startActivity(hisIntent);
        }
        return true;
    }

    private OnTouchListener onTouchListener() {
        return new OnTouchListener() {

            @SuppressLint("ClickableViewAccessibility")
            float dX, dY;

            @Override
            public boolean onTouch(View view, MotionEvent event) {

                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:

                        dX = view.getX() - event.getRawX();
                        dY = view.getY() - event.getRawY();
                        break;

                    case MotionEvent.ACTION_MOVE:

                        view.animate()
                                .x(event.getRawX() + dX)
                                .y(event.getRawY() + dY)
                                .setDuration(0)
                                .start();
                        break;
                    default:
                        return false;
                }
                return true;
            }
        };
    }
}
