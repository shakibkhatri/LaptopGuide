package com.example.laptopguide

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.laptopguide.databinding.LaptopDesignBinding

class LaptopAdapter(var dataList:ArrayList<ItemsViewModel>,var urls:ArrayList<String>, var context:Context):RecyclerView.Adapter<LaptopAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopAdapter.ViewHolder {

        var binding = LaptopDesignBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: LaptopAdapter.ViewHolder, position: Int) {

        anima(holder.itemView)
        holder.binding.ivImage.setImageResource(dataList.get(position).laptopImage)
        holder.binding.tvName.text = dataList.get(position).laptopName
        holder.binding.tvSpecs.text = dataList.get(position).laptopSpecs
        holder.binding.tvPrice.text = dataList.get(position).laptopPrice
        holder.binding.btnBuy.text = dataList.get(position).laptopBuy
        holder.binding.btnShare.setOnClickListener {
            var intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT,"See this laptop $urls")
            val chooser =Intent.createChooser(intent, "Share This Laptop Using....")
            context.startActivity(chooser)
        }
        holder.binding.btnBuy.setOnClickListener(View.OnClickListener(){
            val intent = Intent(android.content.Intent.ACTION_VIEW)
            intent.data = Uri.parse(urls[holder.adapterPosition])
            context.startActivity(intent)
        })
    }

    inner class ViewHolder(var binding:LaptopDesignBinding): RecyclerView.ViewHolder(binding.root)


    fun anima (view:View){

            var animation= AlphaAnimation(0.0f, 1.0f)
            animation.duration = 1500
            view.startAnimation(animation)
        }

}