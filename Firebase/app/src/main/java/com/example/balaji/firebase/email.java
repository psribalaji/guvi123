package com.example.balaji.firebase;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class email extends AppCompatActivity {

    private EditText email,password,firstname;
    private Button button;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        firebaseAuth = FirebaseAuth.getInstance();
        email = (EditText)findViewById(R.id.editText);
        password = (EditText) findViewById(R.id.editText2);
        firstname =(EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
    }

    private void register(){

        String id = email.getText().toString().trim();
        String pass = password.getText().toString().trim();

        String name = firstname.getText().toString().trim();
       //     Toast.makeText(getApplicationContext(),id+pass,Toast.LENGTH_LONG).show();
        if(TextUtils.isEmpty(id)){
            Toast.makeText(getApplicationContext(),"Email Empty",Toast.LENGTH_LONG).show();
        return;
        }
        if(TextUtils.isEmpty(pass)){
            Toast.makeText(getApplicationContext(),"Pass Empty",Toast.LENGTH_LONG).show();
            //return;
        }
        firebaseAuth.createUserWithEmailAndPassword(id,pass).addOnCompleteListener(email.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                Toast.makeText(getApplicationContext(),"Working",Toast.LENGTH_LONG).show();

                if(task.isSuccessful()){
                    Toast.makeText(getApplicationContext(),"Succcess"+task.isSuccessful(),Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(email.this,profile.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(),"NOT Succcess"+task.getException(),Toast.LENGTH_LONG).show();

                }
            }
        });
        if(firebaseAuth.getCurrentUser()!=null){
            Intent intent = new Intent(email.this,profile.class);
            startActivity(intent);
        }

    }
}
