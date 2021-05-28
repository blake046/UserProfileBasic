package com.example.userprofileassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class GradeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grade)
        val backButton = findViewById<Button>(R.id.button3)
        val editText1 = findViewById<EditText>(R.id.editTextNumber);
val showGrade = findViewById<Button>(R.id.button5);
        val textViewResult = findViewById<TextView>(R.id.textView4);
        showGrade.setOnClickListener {
            val num1 = editText1.text.toString().toInt();
            if (num1>93)
            {
                textViewResult.text = ("A").toString();
            }
            else if (num1>90)
            {
                textViewResult.text = ("A-").toString();
            }
            else if (num1>87)
            {
                textViewResult.text = ("B+").toString();
            }
            else if(num1>83)
            {
                textViewResult.text = ("B").toString();
            }
            else if (num1>80)
            {
                textViewResult.text = ("B-").toString();
            }
            else if (num1>77)
            {
                textViewResult.text = ("C+").toString();
            }
            else if(num1>73)
            {
                textViewResult.text = ("C").toString();
            }
            else if(num1>70)
            {
                textViewResult.text = ("C-").toString();
            }
            else if(num1>67)
            {
                textViewResult.text = ("D+").toString();
            }
            else if(num1>63)
            {
                textViewResult.text = ("D").toString();
            }
            else if(num1>60)
            {
                textViewResult.text = ("D-").toString();
            }
            else{
                textViewResult.text = ("F").toString();
            }
        }
        backButton.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent) }
    }
}