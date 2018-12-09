package com.exam

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.widget.TextView
//import android.support.v7.app.AppCompatActivity
import android.graphics.drawable.Animatable
import android.view.View

class MainActivity extends Activity {
    // allows accessing `.value` on TR.resource.constants
    implicit val context: Context = this

    override def onCreate(savedInstanceState: Bundle): Unit = {
      super.onCreate(savedInstanceState)
      val view = new TextView(this)
      view.setText("halo")
      val r = android.R
      setTheme(r.style.Theme_DeviceDefault_Dialog_NoActionBar)
      setContentView(view)
    }
}
