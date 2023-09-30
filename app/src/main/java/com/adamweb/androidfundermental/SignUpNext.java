package com.adamweb.androidfundermental;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpNext extends AppCompatActivity {

    TextView title;
    Button continueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_next);
        title = findViewById(R.id.signup_title_next);
        continueBtn = findViewById(R.id.continue_btn_next);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUpLast.class);
                Pair [] pairs = new Pair[2];
                pairs [0] = new Pair<View, String>(title, "title_transition");
                pairs [1] = new Pair<View, String>(continueBtn, "continue_btn_transition");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUpNext.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });
    }
}