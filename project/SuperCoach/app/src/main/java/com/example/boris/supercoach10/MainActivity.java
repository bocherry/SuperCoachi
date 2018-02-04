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

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Intent myIntent = new Intent(MainActivity.this,SelectActivity.class);
                startActivity(myIntent);
                return true;

            case R.id.adversaire:
                Intent hisIntent = new Intent(MainActivity.this,HockeyAdversaireActivity.class);
                startActivity(hisIntent);
                return true;
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
