package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.contract.ActivityResultContracts

class CAone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caone)
        val imgV=findViewById<ImageView>(R.id.imagg)
        val btn=findViewById<Button>(R.id.btn)
        val geti=registerForActivityResult(  //fetching the image to geti
            ActivityResultContracts.GetContent(),   //to get the image from gallery
            ActivityResultCallback {            //to set the image on imageView
                imgV.setImageURI(it)
            }
        )

        btn.setOnClickListener{
            geti.launch("image/*")  //to fetch any image /*
        }


        val login = findViewById<Button>(R.id.login)
        val signin=findViewById<Button>(R.id.signin)

    }
}
