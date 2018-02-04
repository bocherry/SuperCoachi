package com.example.boris.supercoach10;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by Boris on 03-02-18.
 */

public class SelectActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_sport);

        Button hockey = (Button) findViewById(R.id.hockey);
        Button rugby = (Button) findViewById(R.id.rugby);

        hockey.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SelectActivity.this,MainActivity.class);
                startActivity(myIntent);
            }
        });
        rugby.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(SelectActivity.this,RugbyActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
