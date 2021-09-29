package com.example.helloworld

import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import java.lang.Exception

/*
Use the layout to make changes to the app
Add more UI elements
Customize elements
Explore the Design View, then edit elements with XML
*/

class MainActivity : AppCompatActivity() {
    lateinit var Welcome_Text : TextView
    lateinit var DONE : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Welcome_Text = findViewById(R.id.WelcomeText)
        Welcome_Text.text = "ya ahllan w sahllan"
        DONE = findViewById(R.id.DONE)
        DONE.setOnClickListener {ChangeText()}
    }//end of the function
   fun ChangeText(){
       Welcome_Text.text = "Welcome Again"
       Welcome_Text.setTextColor(Color.parseColor("#FF000000"))
   }
}//end of the class
/* //printing to the console
           var BT_Message = "Hey there! What is your blood type?"
           Log.d("MainActivity",BT_Message)
           var User_BT = "o-"
           //using if statements
           if (User_BT == "a+" || User_BT == "a-"){
               Log.d("MainActivity","your blood type is ${User_BT} so that means you can donate to blood types of A+/A- , AB+/AB-")
           }else if(User_BT == "b+" || User_BT == "b-"){
               Log.d("MainActivity","your blood type is ${User_BT} so that means you can donate to blood types of B+/B- , AB+/AB-")
           } else if (User_BT == "ab+" || User_BT == "ab-"){
               Log.d("MainActivity","your blood type is ${User_BT} so that means you can donate only to blood types of AB+/AB-")
           } else if (User_BT == "o+" || User_BT == "o-"){
               Log.d("MainActivity","your blood type is ${User_BT} so that means you can donate to blood types of A+/A- , B+/B- , AB+/AB- and O+/O-")
           }

       var DA_Message = "Hey again!how old are you?"
       Log.d("MainActivity",DA_Message)
       var User_Age = 14
       //and call them within the onCreate method
       AgeOfDonor(User_Age)*/


//Add some custom functions
/*fun AgeOfDonor(age:Int){
     //performing basic calculations
     when {
         age < 18 -> Log.d("MainActivity","You are less than 18! you can't be a blood donor. You have ${18-age} years until you can donate")
         age >= 18 -> Log.d("MainActivity","You are ${age} you can be a blood donor")
     }
 }*/
