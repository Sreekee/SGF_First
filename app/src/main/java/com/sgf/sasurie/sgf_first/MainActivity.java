package com.sgf.sasurie.sgf_first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="extra";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendToActivity(View view){
            Intent intent=new Intent(this,SecondActivity.class);
            EditText editText=(EditText) findViewById(R.id.editText);
            String message=editText.getText().toString();
            intent.putExtra(EXTRA_MESSAGE,message);
            startActivity(intent);


    }
    public void toastMessage(View view){
        EditText editText=(EditText) findViewById(R.id.editText);
        String message=editText.getText().toString();
        Toast toast=new Toast(this);
        toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
    }
}
