package com.example.realnews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    TextView username, changeusername, changegender, changepwd, changeemail, tvfeedback;
    EditText newusername, newgender, newpwd, newemail, feedbackinput;
    Button btnusername, btngender, btnpwd, btnemail, btnsubmit, btnsignout;
    String newUsername, newGender, newPassword, newEmail, Feedback;
    int usernameStatus = 0, genderStatus = 0, pwdStatus = 0, emailStatus = 0, feedbackStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        username = findViewById(R.id.username);
        changeusername = findViewById(R.id.changeusername);
        changepwd = findViewById(R.id.changepwd);
        changeemail = findViewById(R.id.changeemail);
        btnusername = findViewById(R.id.btnusername);
        changegender = findViewById(R.id.changegender);
        newgender = findViewById(R.id.newgender);
        btngender = findViewById(R.id.btngender);
        btnpwd = findViewById(R.id.btnpwd);
        btnemail = findViewById(R.id.btnemail);
        newusername = findViewById(R.id.newusername);
        newpwd = findViewById(R.id.newpwd);
        newemail = findViewById(R.id.newemail);
        tvfeedback = findViewById(R.id.tvfeedback);
        feedbackinput = findViewById(R.id.feedbackinput);
        btnsubmit = findViewById(R.id.btnsubmit);
        btnsignout = findViewById(R.id.btnsignout);

        newusername.setVisibility(View.GONE);
        btnusername.setVisibility(View.GONE);
        newgender.setVisibility(View.GONE);
        btngender.setVisibility(View.GONE);
        newpwd.setVisibility(View.GONE);
        btnpwd.setVisibility(View.GONE);
        newemail.setVisibility(View.GONE);
        btnemail.setVisibility(View.GONE);
        feedbackinput.setVisibility(View.GONE);
        btnsubmit.setVisibility(View.GONE);

        changeusername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(usernameStatus == 0) {
                    usernameStatus = 1;
                    newusername.setVisibility(View.VISIBLE);
                    btnusername.setVisibility(View.VISIBLE);
                } else {
                    usernameStatus = 0;
                    newusername.setVisibility(View.GONE);
                    btnusername.setVisibility(View.GONE);
                }

                btnusername.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (newusername.getText().toString().isEmpty()) {
                            Toast.makeText(Settings.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
                        } else {
                            newUsername = newusername.getText().toString().trim();
                            newusername.setVisibility(View.GONE);
                            btnusername.setVisibility(View.GONE);
                            Toast.makeText(Settings.this, "Username changed succesfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        changegender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(genderStatus == 0) {
                    genderStatus = 1;
                    newgender.setVisibility(View.VISIBLE);
                    btngender.setVisibility(View.VISIBLE);
                } else {
                    genderStatus = 0;
                    newgender.setVisibility(View.GONE);
                    btngender.setVisibility(View.GONE);
                }

                btngender.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (newgender.getText().toString().isEmpty()) {
                            Toast.makeText(Settings.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
                        } else {
                            newGender = newgender.getText().toString().trim();
                            newgender.setVisibility(View.GONE);
                            btngender.setVisibility(View.GONE);
                            Toast.makeText(Settings.this, "Username changed succesfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        changepwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(pwdStatus == 0) {
                    pwdStatus = 1;
                    newpwd.setVisibility(View.VISIBLE);
                    btnpwd.setVisibility(View.VISIBLE);
                } else {
                    pwdStatus = 0;
                    newpwd.setVisibility(View.GONE);
                    btnpwd.setVisibility(View.GONE);
                }

                btnpwd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (newpwd.getText().toString().isEmpty()) {
                            Toast.makeText(Settings.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
                        } else {
                            newPassword = newpwd.getText().toString().trim();
                            newpwd.setVisibility(View.GONE);
                            btnpwd.setVisibility(View.GONE);
                            Toast.makeText(Settings.this, "Password changed succesfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        changeemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(emailStatus == 0) {
                    emailStatus = 1;
                    newemail.setVisibility(View.VISIBLE);
                    btnemail.setVisibility(View.VISIBLE);
                } else {
                    emailStatus = 0;
                    newemail.setVisibility(View.GONE);
                    btnemail.setVisibility(View.GONE);
                }

                btnemail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (newemail.getText().toString().isEmpty()) {
                            Toast.makeText(Settings.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
                        } else {
                            newEmail = newemail.getText().toString().trim();
                            newemail.setVisibility(View.GONE);
                            btnemail.setVisibility(View.GONE);
                            Toast.makeText(Settings.this, "Email changed succesfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        tvfeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(feedbackStatus == 0) {
                    feedbackStatus = 1;
                    feedbackinput.setVisibility(View.VISIBLE);
                    btnsubmit.setVisibility(View.VISIBLE);
                } else {
                    feedbackStatus = 0;
                    feedbackinput.setVisibility(View.GONE);
                    btnsubmit.setVisibility(View.GONE);
                }

                btnsubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (feedbackinput.getText().toString().isEmpty()) {
                            Toast.makeText(Settings.this, "Field can't be empty", Toast.LENGTH_SHORT).show();
                        } else {
                            Feedback = feedbackinput.getText().toString().trim();
                            feedbackinput.setVisibility(View.GONE);
                            btnsubmit.setVisibility(View.GONE);
                            Toast.makeText(Settings.this, "Email changed succesfully", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

        btnsignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.this, com.example.realnews.Login.class);
                startActivity(intent);
            }
        });

    }
}