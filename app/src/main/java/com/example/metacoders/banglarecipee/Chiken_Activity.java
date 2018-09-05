package com.example.metacoders.banglarecipee;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Chiken_Activity extends AppCompatActivity {

    public Button murgi_jhol ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chiken_);
        murgi_jhol = (Button)findViewById(R.id.murgi_jhol_btn);



        murgi_jhol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext() , murgi_jhol_Activity.class) ;
                startActivity(i);
            }
        });




    }
}
