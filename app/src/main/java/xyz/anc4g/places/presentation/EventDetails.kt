package xyz.anc4g.places.presentation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.appbar.*
import xyz.anc4g.places.R

/**
 * Created by aikay on 8/4/17.
 */
class EventDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.event_details)
        setSupportActionBar(toolbar)
        supportActionBar!!.setHomeButtonEnabled(true)
        collapsingToolbarLayout.title = "Event Details"
    }
}