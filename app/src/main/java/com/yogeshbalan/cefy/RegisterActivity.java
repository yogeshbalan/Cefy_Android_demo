package com.yogeshbalan.cefy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    private CardView cardView;
    private Button verifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cardView = (CardView) findViewById(R.id.phone_cardview);
        verifyButton = (Button) findViewById(R.id.login);
        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });
        StartAnimations();
    }

    private void StartAnimations() {
        Animation anim;

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();

        cardView.clearAnimation();
        cardView.setAnimation(anim);

    }

}
