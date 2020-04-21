package com.example.toolbarexample

import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.example.toolbarexample.R.*
import kotlinx.android.synthetic.main.activity_toolbar.*
import androidx.appcompat.widget.Toolbar

class StandaloneToolBar: AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_toolbar)
//        val mToolbar : androidx.appcompat.widget.Toolbar = toolbar as androidx.appcompat.widget.Toolbar
//        setSupportActionBar(mToolbar)
        val mToolbar = supportActionBar
        mToolbar!!.title = "Standalone ToolBar"
        mToolbar!!.subtitle = "by Khoanh"
//        mToolbar.inflateMenu(R.menu.menu_main)
//        mToolbar.setOnMenuItemClickListener()

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val title: String = item.title.toString()
        Toast.makeText(this,title,Toast.LENGTH_SHORT).show()
        return when (item.itemId) {
            R.id.save -> {
                Toast.makeText(applicationContext, "click on save", Toast.LENGTH_LONG).show()
                true
            }
            R.id.settings ->{
                Toast.makeText(applicationContext, "click on settings", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.web_search ->{
                Toast.makeText(applicationContext, "click on web search", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.help ->{
                Toast.makeText(applicationContext,"click on help",Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
        return true
    }

}