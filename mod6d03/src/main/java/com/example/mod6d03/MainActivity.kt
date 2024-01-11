package com.example.mod6d03

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {

    val activityCallContract =
        registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
            if (isGranted) {
                Intent(Intent.ACTION_CALL, Uri.parse("tel:0606060606")).also {
                    startActivity(it)
                }
            } else {

                Intent(Intent.ACTION_DIAL, Uri.parse("tel:0606060606")).also {
                    startActivity(it)
                }
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityCallContract.launch(android.Manifest.permission.CALL_PHONE)

    }
}