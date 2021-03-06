package com.saif.notes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    CircleImageView user,employee,admin,info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_main);
        user = findViewById(R.id.user);
        employee = findViewById(R.id.employee);
        admin = findViewById(R.id.admin);
        info = findViewById(R.id.info);

        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("Data","https://app.securepdf.ml");
                startActivity(intent);
            }
        });

        employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("Data","https://app.securepdf.ml/admin");
                startActivity(intent);
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                intent.putExtra("Data","https://app.securepdf.ml/admin");
                startActivity(intent);
            }
        });

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://securepdf.ml";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.android.chrome");
                try{
                    MainActivity.this.startActivity(intent);
                }catch (Exception e){
                    intent.setPackage(null);
                    MainActivity.this.startActivity(intent);
                }
            }
        });
    }
}
