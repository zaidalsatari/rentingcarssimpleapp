package com.example.app2

import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.core.widget.doOnTextChanged
import com.google.android.material.navigation.NavigationBarView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val total_bt: Button = findViewById(R.id.TotalBt)
        val name: EditText = findViewById(R.id.NameEd)
        val gender: EditText = findViewById(R.id.GenderEd)
        val age: EditText = findViewById(R.id.AgeEd)
        val day: EditText = findViewById(R.id.DayEd)
        val total: TextView = findViewById(R.id.TotalTxt)

        var flag_1: String = "Toyota"
        val Car_sp : Spinner = findViewById(R.id.carspinner)
        var options_car = arrayOf("Toyota","Honda","BMW","Hyundai","Kia")

        Car_sp.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options_car)
        Car_sp.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag_1 = options_car.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
        total_bt.setOnClickListener { view ->

            val x :Int = day.text.toString().toInt();


            if (flag_1 == "Toyota")
                total.text = (30 * x).toString()+"$";
            else if (flag_1 == "Honda")
                total.text =(24 * x).toString()+"$";
            else if (flag_1 == "BMW")
                total.text = (40 * x).toString()+"$";
            else if (flag_1 == "Hyundai")
                total.text = (18 * x).toString()+"$";
            else if (flag_1 == "Kia")
                total.text = (15 * x).toString()+"$";
        }


    }
}

