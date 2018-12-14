package com.exam

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import org.scaloid.common._

class MainActivity extends Activity with SContext {

  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    val view = new TextView(this)
    view.setText("halo")

    val ly = new SVerticalLayout {
      new SLinearLayout {
        SEditText() //(context,null)
        SButton("aa")
        SButton("b")
      }.gravity(Gravity.RIGHT).wrap.here

      STextView("Sign in") //(context,null)

    }.padding(20.dip)

    setContentView(ly)

  }
}
