package com.pretichor.testlibrary

import android.content.Context
import android.widget.Toast
import es.dmoral.toasty.Toasty

class HelloLib(context: Context) {

  init {
    Toasty.success(context, "Lib is Work", Toast.LENGTH_LONG).show()
  }
}