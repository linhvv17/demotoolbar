package com.example.toolbarexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showStandaloneToolbar(view: View) {
        val intent = Intent(this,StandaloneToolBar::class.java)
        startActivity(intent)
    }
    fun showToolbarAsActionbar(view: View) {
        val intent = Intent(this, ActionBarToolBar::class.java)
        startActivity(intent)
    }
    fun showContextualMenu(view: View) {
        val intent = Intent(this, ContextualMenu::class.java)
        startActivity(intent)
    }
}
