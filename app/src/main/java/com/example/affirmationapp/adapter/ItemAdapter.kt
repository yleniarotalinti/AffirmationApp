package com.example.affirmationapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmationapp.R
import com.example.affirmationapp.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter (val context: Context, private val dataset: List<Affirmation>)  : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    //nested class: this class is used only inside the ItemAdappter class
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView : ImageView = view.findViewById(R.id.item_image)
    }

    //The onCreateViewHolder()method is called by the layout manager to create new view holders for the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    //This method is called by the layout manager in order to replace the contents of a list item view.
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    //The getItemCount() method needs to return the size of your dataset.
    override fun getItemCount(): Int {
        return dataset.size
    }
}