package com.example.week2_group2.Menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.week2_group2.Data.Info
import com.example.week2_group2.R
import androidx.recyclerview.widget.ListAdapter

class MenuAdapter : ListAdapter<Info,MenuAdapter.MenuViewHolder>(MenuDiffUtil()) {

    private  lateinit var  mListener: onItemClickListener

    interface onItemClickListener{
        fun onItemClick(postion: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder.from(parent,mListener) // Thực hiện tạo ViewHolder
    }


    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val info = getItem(position) // Thiết lập vị trí hiển thị các Item View
        holder.seeData(info)

    }

    class MenuDiffUtil : DiffUtil.ItemCallback<Info>(){
        override fun areItemsTheSame(oldItem: Info, newItem: Info): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Info, newItem: Info): Boolean {
            return oldItem == newItem
        }

    }

    /*override fun getItemCount(): Int {
        return dataSet.size
    }*/

    class MenuViewHolder(itemView: View,listener: onItemClickListener) : RecyclerView.ViewHolder(itemView) {

        companion object {
            fun from(parent: ViewGroup, mListener: onItemClickListener): MenuViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater.inflate(R.layout.item_view_restaurant, parent, false)
                return MenuViewHolder(view,mListener)

            }

        }

        init{
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }



        fun seeData(info: Info){
            val nameOfRes = itemView.findViewById<TextView>(R.id.txt_name)
            val addressOfRes = itemView.findViewById<TextView>(R.id.txt_address)
            val imageOfRes = itemView.findViewById<ImageView>(R.id.image_res)
            nameOfRes.text = info.name // Setup tên cho Item View được hiển thị lên RecyclerView
            addressOfRes.text = info.address

            Glide.with(itemView.context).load(info.link).into(imageOfRes)





        }


    }


}