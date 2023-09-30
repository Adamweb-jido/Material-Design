package com.adamweb.androidfundermental;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    TextView title;
    Button continueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        title = findViewById(R.id.signup_title);
        continueBtn = findViewById(R.id.continue_btn);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpNext.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new Pair<View, String>(title, "sign_up_title_transition");
                pairs[1] = new Pair<View, String>(continueBtn, "continue_btn_transition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUp.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });
    }
}