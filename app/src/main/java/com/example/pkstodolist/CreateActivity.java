package com.example.pkstodolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CreateActivity extends AppCompatActivity {
    private Button btnCreate;
    private Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        btnCreate = (Button) findViewById(R.id.btnCreate);
        btnCreate.setOnClickListener(new
                                             View.OnClickListener() {
                                                 public void onClick(View arg0) {
                                                     Intent createActivity = new
                                                             Intent(getApplicationContext(), CreateActivity.class);
                                                     startActivity(createActivity);
                                                 }
                                             });
        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new
                                             View.OnClickListener() {
                                                 public void onClick(View arg0) {
                                                     Intent listActivity = new
                                                             Intent(getApplicationContext(), ListActivity.class);
                                                     startActivity(listActivity);
                                                 }
                                             });
    }
}