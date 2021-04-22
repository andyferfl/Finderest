package com.finderestteam.finderest.ui.registation

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import com.finderestteam.finderest.R

class RegistrationPart3 : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.whole_registation)
        val buu = findViewById<Button>(R.id.button7)
    }
    fun button1(view: View){
        val lay1 = findViewById<ConstraintLayout>(R.id.Layout1)
        val lay2 = findViewById<ConstraintLayout>(R.id.Layout2)
        lay1.visibility = View.GONE
        lay2.visibility = View.VISIBLE
    }

    fun button2(view: View){
        val lay2 = findViewById<ConstraintLayout>(R.id.Layout2)
        val lay3 = findViewById<ConstraintLayout>(R.id.Layout3)
        lay2.visibility = View.GONE
        lay3.visibility = View.VISIBLE
    }
    fun button3(view: View){
        val lay3 = findViewById<ConstraintLayout>(R.id.Layout3)
        val lay4 = findViewById<ConstraintLayout>(R.id.Layout4)
        lay3.visibility = View.GONE
        lay4.visibility = View.VISIBLE
    }
    fun button4(view: View){
        val no = Toast.makeText(this, "End of the registration", Toast.LENGTH_SHORT)
        no.show()
        val int2 = Intent()
        int2.putExtra("name","data3")
        setResult(2, int2)
        finish()
    }

}