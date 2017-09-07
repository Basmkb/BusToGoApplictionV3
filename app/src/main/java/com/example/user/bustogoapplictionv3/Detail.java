package com.example.user.bustogoapplictionv3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        TextView titleTextView = (TextView) findViewById(R.id.txtTitleDetail);
        TextView detailTextView = (TextView)findViewById(R.id.txtDetailSco);
        ImageView imageView = (ImageView)findViewById(R.id.imvimageDetail);
        Button button =(Button)findViewById(R.id.btnBack);

       titleTextView.setText(getIntent().getStringExtra("Title"));
       detailTextView.setText(getIntent().getStringExtra("Detail"));

    }

    public void clickBack (View view) {finish();}

}
