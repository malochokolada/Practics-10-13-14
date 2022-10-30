package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textNameS: EditText= findViewById(R.id.editTextPersonNameSa1)
        val textEmailS: EditText= findViewById(R.id.editEmailAddressSa2)
        val textAgeS: EditText= findViewById(R.id.editTextPersonAgeSa3)

        val arguments: Bundle? = intent.extras

        if (arguments != null){
            val name : String = arguments.get("name").toString()
            val email : String? = arguments.getString("email")
            val age: Int?=arguments.getInt("age")

            textNameS.setText("$name")
            textEmailS.setText("$email")
            textAgeS.setText("$age")


        }

    }

    fun onClickS(view: View){
         val tName: EditText=findViewById(R.id.editTextPersonNameSa1)
         val tAge: EditText=findViewById(R.id.editTextPersonAgeSa3)
         val tEmail:EditText=findViewById(R.id.editEmailAddressSa2)

         val name = tName.text.toString()
         val email = tEmail.text.toString()
         val age = tAge.text.toString()

         val intent:Intent= Intent(this@SecondActivity,MainActivity::class.java)

         intent.putExtra("name",name)
         intent.putExtra("age",age)
         intent.putExtra("email",email)
        startActivity(intent)
     }
}