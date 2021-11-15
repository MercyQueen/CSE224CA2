package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class CAtwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catwo)

        val rg:RadioGroup = findViewById<RadioGroup>(R.id.radiogroup)
        val rb = rg.checkedRadioButtonId
        val radio = findViewById<RadioButton>(rb)

        rg.setOnCheckedChangeListener { radioGroup, i -> val radio:RadioButton = findViewById(i)
            Toast.makeText(applicationContext,"${radio.text}",Toast.LENGTH_SHORT).show()
        }
        val cb=findViewById<CheckBox>(R.id.cb)
        cb.setOnClickListener{
            if(cb.isChecked)
                Toast.makeText(applicationContext,"checked",Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(applicationContext,"Unchecked",Toast.LENGTH_SHORT).show()
        }




    }
}
