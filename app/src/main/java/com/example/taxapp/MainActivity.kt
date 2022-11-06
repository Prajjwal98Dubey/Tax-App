package com.example.taxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var etamount:EditText
    lateinit var btn:Button
    lateinit var t_tax:TextView
    lateinit var t_taxamount:TextView
    lateinit var t_salary:TextView
    lateinit var t_amount:TextView
    lateinit var reset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etamount=findViewById(R.id.etamount)
        btn=findViewById(R.id.btn)
        t_tax=findViewById(R.id.t_tax)
        t_taxamount=findViewById(R.id.t_taxamount)
        t_salary=findViewById(R.id.t_salary)
        t_amount=findViewById(R.id.t_amount)
        reset=findViewById(R.id.reset)


        btn.setOnClickListener{
            val entered_amount=etamount.text.toString().toInt()

            if(entered_amount>0 && entered_amount<=250000){
                t_taxamount.text="0"
                t_amount.text="$entered_amount"
            }
            else if(entered_amount>250000 && entered_amount<500000){
                val cal_tax=(entered_amount * 5)/100
                t_taxamount.text="$cal_tax"
                t_amount.text="${entered_amount-cal_tax}"
                Toast.makeText(this, "Paid 5% Tax", Toast.LENGTH_LONG).show()
            }
            else if(entered_amount>=500000 && entered_amount<750000){
                val cal_tax=(entered_amount * 10)/100
                t_taxamount.text="$cal_tax"
                t_amount.text="${entered_amount-cal_tax}"
                Toast.makeText(this, "Paid 10% Tax", Toast.LENGTH_LONG).show()
            }
            else if (entered_amount>=750000 && entered_amount<1000000){
                val cal_tax=(entered_amount * 15)/100
                t_taxamount.text="$cal_tax"
                t_amount.text="${entered_amount-cal_tax}"
                Toast.makeText(this, "Paid 15% Tax", Toast.LENGTH_LONG).show()
            }
            else if(entered_amount>=1000000 && entered_amount<1250000)
            {
                val cal_tax=(entered_amount * 20)/100
                t_taxamount.text="$cal_tax"
                t_amount.text="${entered_amount-cal_tax}"
                Toast.makeText(this, "Paid 20% Tax", Toast.LENGTH_LONG).show()
            }
            else if(entered_amount>=1250000 && entered_amount<1500000){
                val cal_tax=(entered_amount * 25)/100
                t_taxamount.text="$cal_tax"
                t_amount.text="${entered_amount-cal_tax}"
                Toast.makeText(this, "Paid 25% Tax", Toast.LENGTH_LONG).show()
            }
            else{
                val cal_tax=(entered_amount * 30)/100
                t_taxamount.text="$cal_tax"
                t_amount.text="${entered_amount-cal_tax}"
                Toast.makeText(this, "Paid 30% Tax", Toast.LENGTH_LONG).show()
            }

        }

        reset.setOnClickListener{
            etamount.setText("0")
            t_amount.text="0"
            t_taxamount.text="0"

        }



    }
}