package com.example.karimelsaidy.smarthome;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.animation.LayoutTransition;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
TextView logout = findViewById(R.id.logout);
logout.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent login = new Intent(home.this,LoginActivity.class);
        startActivity(login);
    }
});

    }
    public void dialogAbout(View v){
       final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setContentView(R.layout.about);
        dialog.setTitle(R.string.about);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation_2;
        dialog.show();
    }
    public void dialogContact(View v){
        final Dialog dialog = new Dialog(this); // Context, this, etc.
        dialog.setContentView(R.layout.contact_us);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation_2;
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
    }
}
