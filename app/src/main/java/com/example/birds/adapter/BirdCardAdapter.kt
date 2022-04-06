package com.example.birds.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.birds.R
import com.example.birds.const.Layout
import com.example.birds.data.DataSource

class BirdCardAdapter(
    private val context: Context?,
    private val layout: Int
): RecyclerView.Adapter<BirdCardAdapter.BirdCardViewHolder>() {

    private val data = DataSource.bird

    class BirdCardViewHolder(view: View?): RecyclerView.ViewHolder(view!!) {
        val birdImage : ImageView = view!!.findViewById(R.id.bird_image)
        val birdName : TextView = view!!.findViewById(R.id.bird_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BirdCardViewHolder {
        val adapterLayout = when(layout){
            Layout.GRID->{
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.grid_list_item, parent, false)
            }
            else -> {
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.vertical_horizontal_list_item, parent, false)
            }
        }
        return BirdCardViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: BirdCardViewHolder, position: Int) {
        val birdItem = data[position]
        holder.birdImage.setImageResource(birdItem.imageResourceId)
        holder.birdName.text = birdItem.name
    }
}