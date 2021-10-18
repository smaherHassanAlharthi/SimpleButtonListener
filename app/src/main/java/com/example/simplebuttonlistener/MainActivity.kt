package com.example.simplebuttonlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val code=findViewById<Button>(R.id.btcode)
        code.setOnClickListener{
            Toast.makeText(this,"Code",Toast.LENGTH_SHORT).show()
        }

    }

    fun toast(v:View){
        Toast.makeText(this,"Xml",Toast.LENGTH_SHORT).show()
    }

}