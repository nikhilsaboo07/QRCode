package com.example.qrcode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class HomeActivity extends AppCompatActivity
    {

   private  Button b1,b2,camera;
      //  private static final int CAMERA_PERMISSION_CODE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        b1=findViewById(R.id.button);
        b2=findViewById(R.id.button1);
//        camera = findViewById(R.id.camera);
//        camera.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                checkPermission(Manifest.permission.CAMERA, CAMERA_PERMISSION_CODE);
//            }
//        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeActivity.this,ScannerActivity.class);
                startActivity(i);


            }
        });

    }
//        public void checkPermission(String permission, int requestCode)
//        {
//            if (ContextCompat.checkSelfPermission(HomeActivity.this, permission) == PackageManager.PERMISSION_DENIED) {
//
//                // Requesting the permission
//                ActivityCompat.requestPermissions(HomeActivity.this, new String[] { permission }, requestCode);
//            }
//            else {
//                Toast.makeText(HomeActivity.this, "Permission already granted", Toast.LENGTH_SHORT).show();
//            }
//        }
//        @Override
//        public void onRequestPermissionsResult(int requestCode,
//                                               @NonNull String[] permissions,
//                                               @NonNull int[] grantResults)
//        {
//            super.onRequestPermissionsResult(requestCode,
//                    permissions,
//                    grantResults);
//
//            if (requestCode == CAMERA_PERMISSION_CODE) {
//                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    Toast.makeText(HomeActivity.this, "Camera Permission Granted", Toast.LENGTH_SHORT) .show();
//                }
//                else {
//                    Toast.makeText(HomeActivity.this, "Camera Permission Denied", Toast.LENGTH_SHORT) .show();
//                }
//            }
//        }


}