package com.exam

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
//import android.support.v7.app.AppCompatActivity
import android.graphics.drawable.Animatable
import android.view.View

class MainActivity extends Activity {
    // allows accessing `.value` on TR.resource.constants
    implicit val context = this

    override def onCreate(savedInstanceState: Bundle): Unit = {
      super.onCreate(savedInstanceState)
      val view = new TextView(this)
      view.setText("abcdef")
      setContentView(view)
    }
}
