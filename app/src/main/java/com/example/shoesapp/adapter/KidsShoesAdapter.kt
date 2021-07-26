package com.example.shoesapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoesapp.KidsFragment
import com.example.shoesapp.MenFragment
import com.example.shoesapp.R
import com.example.shoesapp.model.Shoes

class KidsShoesAdapter(
    private val context: KidsFragment,
    private val dataset: List<Shoes>
) : RecyclerView.Adapter<KidsShoesAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textViewPrice: TextView = view.findViewById(R.id.item_price)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_element, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
        holder.textViewPrice.text = context.resources.getString(item.stringResourcePriceId)
    }

    override fun getItemCount() = dataset.size
}