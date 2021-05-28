package com.example.userprofileassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.Switch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val switchbutton = findViewById<Switch>(R.id.switch1);
        val gradeButton = findViewById<Button>(R.id.button);
        val favoriteButton = findViewById<Button>(R.id.button2);
val image = findViewById<ImageView>(R.id.imageView2);
        image.setImageResource(R.drawable.download);
switchbutton.setOnCheckedChangeListener{ compoundButton: CompoundButton, isChecked: Boolean ->
    if (isChecked)
        image.setImageResource(R.drawable.download2);
    else
        image.setImageResource(R.drawable.download);
}
        gradeButton.setOnClickListener{
            val intent = Intent(this,GradeActivity::class.java)
            startActivity(intent)}
favoriteButton.setOnClickListener {
    val intent = Intent (this,FavoriteActivity::class.java)
    startActivity(intent) }

    }

}
