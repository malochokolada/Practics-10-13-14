package com.example.practice14

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.annotation.MainThread
import com.example.practice14.R.id.editTextAge
import com.example.practice14.R.id.editTextName

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textName: EditText=findViewById(R.id.editTextName)
        val textEmail:EditText=findViewById(R.id.editTextEmailAddress)
        val textAge: EditText = findViewById(R.id.editTextAge)

        val arguments: Bundle? = intent.extras
        if (arguments != null){
            val name: String =arguments.get("name").toString()
            val email: String? = arguments.getString("email")
            val age: Int? = arguments.getInt("age")
            textName.setText("$name")
            textAge.setText("$age")
            textEmail.setText("$email")
        }
    }

    fun onClick(view:View){
        val textName1: EditText = findViewById(R.id.editTextName)
        val textEmail2:EditText = findViewById(R.id.editTextEmailAddress)
        val textAge3: EditText = findViewById(R.id.editTextAge)

        val name=textName1.text.toString()
        val email=textEmail2.text.toString().toInt()
        val age=textAge3.text.toString()

        val intent: Intent = Intent(this@MainActivity,SecondActivity::class.java)

        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
        startActivity(intent)
    }
}