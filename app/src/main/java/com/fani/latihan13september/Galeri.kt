package com.fani.latihan13september

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fani.latihan13september.Model.ImageModel
import com.fani.latihan13september.adapter.GalleryAdapter

class Galeri : AppCompatActivity() {
    private val imageList = arrayOf(
        R.drawable.logopoli,
        R.drawable.logoti,
        R.drawable.logomi,
        R.drawable.himati,
        R.drawable.logomesin,
        R.drawable.tekkom
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeri)

        // Set up the GridView for photos
        val gridView = findViewById<GridView>(R.id.gridView)
        val adapter = GalleryAdapter(this, imageList)
        gridView.adapter= adapter

        // Set up onClickListener for grid items
        gridView.setOnItemClickListener { _, _, position, _ ->
            val intent = Intent(this, Foto_detail::class.java)
            intent.putExtra(
                "imageResId",
                imageList[position]
            ) // Pass the selected image ID to detail activity
            startActivity(intent)
        }
    }
}