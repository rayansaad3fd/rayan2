package com.example.rayan;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPassword, editTextTextEmailAddress;
    Button button2, button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextEmailAddress = findViewById(R.id.editTextTextPassword);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);

        button2 = findViewById(R.id.button2);
        button = findViewById(R.id.button);

    }

    public void login(View view) {
        if (editTextTextEmailAddress.getText().toString().equals(""))
            Toast.makeText(this, "Empty Email", Toast.LENGTH_LONG).show();
        else if (editTextTextPassword.getText().toString().equals(""))
            Toast.makeText(this, "Empty Password", Toast.LENGTH_SHORT).show();
        else{
            Intent i = new Intent(this, homeactivity.class);
            startActivity(i);

        }
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_example, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.help_menu:
                Intent i = new Intent(this, activityhelp.class);
                startActivity(i);
                break;

            case R.id.setting_menu:
                Toast.makeText(MainActivity.this, "setting clicked", Toast.LENGTH_SHORT).show();


            case R.id.logout_menu:
                Toast.makeText(MainActivity.this, "logout clicked", Toast.LENGTH_SHORT).show();


        }
        return true;


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("back button was pressed");
        dialog.setMessage("are you you want to exit");
        dialog.setNegativeButton("no", null);
        dialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            //when user clicks on the yes the application closes
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.this.finish();


            }
        });
        dialog.setIcon(R.drawable.r1);
        AlertDialog alertDialog = dialog.create();
        dialog.show();


    }

    public void register(View view) {
        Intent i_register = new Intent(this, registeractivity.class);
        startActivity(i_register);

    }
    }





