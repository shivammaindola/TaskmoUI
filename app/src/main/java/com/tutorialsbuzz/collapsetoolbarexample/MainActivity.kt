package com.tutorialsbuzz.collapsetoolbarexample

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_main.*
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlinx.android.synthetic.main.activity_main.button1
import kotlinx.android.synthetic.main.collapse_bar.*
import kotlinx.android.synthetic.main.content.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.collapse_bar)

        setSupportActionBar(toolbar)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        collapsing_toolbar_layout.setTitle(getResources().getString(R.string.user_name));
        collapsing_toolbar_layout.setContentScrimColor(resources.getColor(R.color.colorPrimary))

        button1.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this,TermsCondition::class.java)
            startActivity(intent)
        })

        toolbarTextAppernce()
    }



    private fun toolbarTextAppernce() {
        collapsing_toolbar_layout.setCollapsedTitleTextAppearance(R.style.collapsedappbar)
        //collapsing_toolbar_layout.setExpandedTitleTextAppearance(R.style.expandedappbar)
    }
}