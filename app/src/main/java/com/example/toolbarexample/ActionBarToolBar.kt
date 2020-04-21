package com.example.toolbarexample

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_toolbar.*
import androidx.appcompat.widget.Toolbar

class ActionBarToolBar: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        val mytoolBar: ActionBar? = supportActionBar
//        setSupportActionBar(mytoolBar)
        mytoolBar!!.title = "ActionBar ToolBar"
        mytoolBar!!.subtitle = "by Khoanh97"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val title : String = item.title.toString()
        Toast.makeText(this,title,Toast.LENGTH_SHORT).show()
        return super.onOptionsItemSelected(item)
    }
}