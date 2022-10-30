package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClick (view: View) {
        val curs: EditText = findViewById(R.id.editTextCurs)//textCurs
        val summ: EditText = findViewById(R.id.editTextSumm)
        var result: TextView = findViewById(R.id.textViewResult)

        val textCurs: Int = curs.text.toString().toInt()//curs
        val textSumm = summ.text.toString().toInt()

        if (curs != null) {
            val resultS= textSumm * textCurs
            result.setText("Результат: $resultS")
        }

        else {
            val toast = Toast.makeText(this,"Введите курс обмена",Toast.LENGTH_LONG).show()
        }

        if (summ==null){
            val toast = Toast.makeText(this,"Введите сумму для обмена",Toast.LENGTH_LONG).show()
        }
    }
}