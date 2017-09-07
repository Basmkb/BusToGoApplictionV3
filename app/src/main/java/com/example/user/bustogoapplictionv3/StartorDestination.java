package com.example.user.bustogoapplictionv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartorDestination extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startor_destination);
    }
    public void btnStarD (View view){
        Intent intent = new Intent(StartorDestination.this,Mainmenu.class);
        startActivity(intent);
    }
}
