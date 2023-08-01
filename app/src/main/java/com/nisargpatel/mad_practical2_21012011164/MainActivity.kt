package com.nisargpatel.mad_practical2_21012011164

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() Method is Called!")
    }
    override fun onStart() {
        super.onStart()
        showMessage("onStart() Method is Called!")
    }
    override fun onResume() {
        super.onResume()
        showMessage("onResume() Method is Called!")
    }
    override fun onPause(){
        super.onPause()
        showMessage("onPause() Method is Called!")
    }
    override fun onStop() {
        super.onStop()
        showMessage("onStop() Method is Called!")
    }
    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy() Method is Called!")
    }
    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart() Method is Called!")
    }
    fun showMessage(msg:String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        val v =findViewById<ConstraintLayout>(R.id.mainlayout)
        if(v!=null){
            Snackbar.make(v,"$msg",Snackbar.LENGTH_LONG).show()
        }
        //Snackbar.make(findViewById(R.id.constraintLay),"$msg",Snackbar.LENGTH_LONG).show()
    }
}
