package com.fani.latihan13september.adapter


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.fani.latihan13september.MainActivity
import com.fani.latihan13september.Model.ImageModel
import com.fani.latihan13september.R

 class GalleryAdapter(private val context: Context, private val images: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return images.size
    }

    override fun getItem(position: Int): Any {
        return images[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val imageView: ImageView

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_galeri, parent, false)
            imageView = view.findViewById(R.id.imageView)
        } else {
            view = convertView
            imageView = view.findViewById(R.id.imageView)
        }

        imageView.setImageResource(images[position])
        return view
    }
}