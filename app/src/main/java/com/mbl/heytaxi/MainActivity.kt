package com.mbl.heytaxi

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.drawable.Icon
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    private lateinit var mMap: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapFragment: SupportMapFragment? =
            supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
        val userIconImageView: ImageView = findViewById(R.id.userIcon)
        val usernameTextView: TextView = findViewById(R.id.usernameTextView)
        val kilometersTextView: TextView = findViewById(R.id.kilometersTextView)

        // Update views with user data
        userIconImageView.setImageResource(R.drawable.maps_and_flags)
        usernameTextView.text = "John Doe"
        kilometersTextView.text = "5 km"
    }
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
    }
}