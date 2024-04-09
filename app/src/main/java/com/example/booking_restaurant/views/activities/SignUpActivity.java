package com.example.booking_restaurant.views.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.booking_restaurant.R;
import com.example.booking_restaurant.repositories.UserRepository;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText edt_email;
    private EditText edt_password;
    private Button btn_sign_up;
    private Button btn_sign_in_form;
    private UserRepository userRepo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mAuth = FirebaseAuth.getInstance();
        userRepo = new UserRepository();

        edt_email = this.findViewById(R.id.edt_email);
        edt_password = this.findViewById(R.id.edt_password);
        btn_sign_up = this.findViewById(R.id.btn_sign_up);
        btn_sign_in_form = this.findViewById(R.id.btn_sign_in_form);
        ButtonSignUp(btn_sign_up);
        btnSignIn(btn_sign_in_form);
    }
    private void btnSignIn(Button btn_sign_in_form){
        btn_sign_in_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    private void ButtonSignUp(Button btn_sign_up){
        btn_sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edt_email.getText().toString().trim();
                String password = edt_password.getText().toString().trim();
                SignUp(email, password);
            }
        });
    }

    private void SignUp(String email, String password) {
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            String uid;
                            uid = task.getResult().getUser().getUid().toString();
                            userRepo.AddUser(uid, "user");

                            Toast.makeText(SignUpActivity.this, uid + " ",
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(SignUpActivity.this, "Đăng ký thất bại.!",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

}