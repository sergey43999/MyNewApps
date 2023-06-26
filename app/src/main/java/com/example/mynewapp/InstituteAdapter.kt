package com.example.mynewapp


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView


class InstituteAdapter( private var instituteList: ArrayList<InstituteData>)
    :RecyclerView.Adapter<InstituteAdapter.InstituteViewHolder>() {

    class InstituteViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstituteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.institute_item, parent, false)
        return InstituteViewHolder(view)
    }

    override fun getItemCount(): Int {
       return instituteList.size
    }

    override fun onBindViewHolder(holder: InstituteViewHolder, position: Int) {
        val institute = instituteList[position]
        holder.imageView.setImageResource(institute.logo)
        holder.textView.text = institute.title
    }

}


//class InstituteAdapter(var mList: List<InstituteData>):
//    RecyclerView.Adapter<InstituteAdapter.LanguageViewHolder>() {
//
//    inner class LanguageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val logo: ImageView = itemView.findViewById(R.id.logoIv)
//        val titleTv: TextView = itemView.findViewById(R.id.titleTv)
//    }
//
//    fun setFilteredList(mList: List<InstituteData>) {
//        this.mList = mList
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.institute_item, parent, false)
//        return LanguageViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
//        holder.logo.setImageResource(mList[position].logo)
//        holder.titleTv.text = mList[position].title
//    }
//
//    override fun getItemCount(): Int {
//        return mList.size
//    }
//}