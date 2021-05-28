package com.example.userprofileassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class FavoriteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favorite)

        val backButton = findViewById<Button>(R.id.button4)
        val spinnerg = findViewById<Spinner>(R.id.spinner);
        val radioGroup = findViewById<RadioGroup>(R.id.RadioGroup);
        val radiobutton = findViewById<RadioButton>(R.id.radioButton3);
        val radiobutton2 = findViewById<RadioButton>(R.id.radioButton4);
        val fruits = arrayOf("pear", "apple", "orange", "grape", "cherry")
        val flowers = arrayOf("daisy", "pansy", "poppy", "rose", "nightshade")


        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val rb = findViewById<RadioButton>(checkedId)
            if (rb != null) {
                if (rb == radiobutton) {
                    val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, fruits);
                    spinnerg.adapter = arrayAdapter;
                    spinnerg.onItemSelectedListener = object :
                            AdapterView.OnItemSelectedListener {
                        override fun onNothingSelected(parent: AdapterView<*>?) {
                            TODO("Not yet implemented")
                        }

                        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                            Toast.makeText(this@FavoriteActivity, "your favorite fruit is " +fruits[position],Toast.LENGTH_SHORT).show();

                        }


                    }


                } else if (rb == radiobutton2) {
                    val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, flowers)
                    spinnerg.adapter = arrayAdapter
spinnerg.onItemSelectedListener = object :
AdapterView.OnItemSelectedListener {
    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(this@FavoriteActivity, "your favorite flower is " +flowers[position],Toast.LENGTH_SHORT).show();

    }


}
            }
        }
    }
}}

