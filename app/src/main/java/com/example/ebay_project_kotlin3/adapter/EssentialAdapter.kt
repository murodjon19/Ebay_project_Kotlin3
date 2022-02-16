package com.example.ebay_project_kotlin3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_project_kotlin3.R
import com.example.ebay_project_kotlin3.mobil.Essential


class EssentialAdapter(var context: Context, var items : ArrayList<Essential>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_feeds_essential,parent,false)
        return EssentialViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is EssentialViewHolder) {
            var tv_title = holder.tv_title
            var iv_image = holder.iv_image
            iv_image.setImageResource(item.image)
            tv_title.text = item.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class EssentialViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var tv_title : TextView
    var iv_image : ImageView

    init {
        tv_title = view.findViewById(R.id.title)
        iv_image = view.findViewById(R.id.image)
    }
}