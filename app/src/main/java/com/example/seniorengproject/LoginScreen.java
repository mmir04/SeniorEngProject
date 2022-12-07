package com.example.seniorengproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {
    private Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        login_button = (Button) findViewById(R.id.button);
        login_button.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            openLoginScreen();
        }
    });

}

    public void openLoginScreen() {
        Intent intent = new Intent(this, LoginScreen.class);
        startActivity(intent);
    }
}