package com.adamweb.androidfundermental;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    Button login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = findViewById(R.id.login_title);
        login = findViewById(R.id.login_btn);
        signup = findViewById(R.id.signup_page);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SignUp.class);
                Pair [] pairs = new Pair[3];
                pairs[0] = new Pair<View, String>(title, "title_transition");
                pairs[1] = new Pair<View, String>(login, "login_btn_transition");
                pairs[2] = new Pair<View, String>(signup, "signup_btn_transition");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                startActivity(intent, options.toBundle());
            }
        });
    }
}