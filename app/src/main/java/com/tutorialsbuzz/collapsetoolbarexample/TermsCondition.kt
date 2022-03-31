package com.tutorialsbuzz.collapsetoolbarexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.conditions.*

class TermsCondition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_condition)

        button2.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this,Signature::class.java)
            startActivity(intent)
        })
    }
}