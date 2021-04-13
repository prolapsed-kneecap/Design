package com.alexux.alexux.designapplication.adapters

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alexux.alexux.designapplication.R

class RecyclerViewAdapter(values:Array<String>, types:Array<String>, images:Array<String>):RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>(){
    val names = values
    val fileTypes = types
    val fileImages = images
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.card_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount():Int = names.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBing(position)
    }

    inner class MyViewHolder internal constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var fileNameTextView: TextView = itemView.findViewById(R.id.fileNameTextView)
        var fileTypeImageView: ImageView = itemView.findViewById(R.id.fileTypeImageView)
        var mainFileImageVIew: ImageView = itemView.findViewById(R.id.MainFileImage)
        fun onBing(position:Int){
            if (fileTypes[position]=="Type1") {
                fileTypeImageView.setImageResource(R.drawable.ic_type_one)
            } else if (fileTypes[position]=="Type2"){
                fileTypeImageView.setImageResource(R.drawable.ic_type_two)
            }
            if (fileImages[position]=="Image1") {
                mainFileImageVIew.setImageResource(R.drawable.ic_image_one)
            }
            else if (fileImages[position]=="Image2"){
                mainFileImageVIew.setImageResource(R.drawable.ic_image_two)
            }
            fileNameTextView.text = names[position]
        }
    }
}