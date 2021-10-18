package com.example.buttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var bt1:Button
    lateinit var bt2:Button
    var amount=26
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv=findViewById(R.id.textView)
        bt1=findViewById(R.id.button)
        bt2=findViewById(R.id.button2)
        tv.text=amount.toString()
        bt1.setOnClickListener{

            amount+=1
            tv.text=amount.toString()

        }
        bt2.setOnClickListener{
            amount-=1
            tv.text=amount.toString()
        }


    }
}