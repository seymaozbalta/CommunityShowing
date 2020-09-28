package com.example.developermulticamp.news

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.developermulticamp.R
import com.example.developermulticamp.data.Community
import kotlinx.android.synthetic.main.item_article.view.*

class ArticlesAdapter(private val articleList:MutableList<Community>,
                      private val onClick:(Community)-> Unit) :
    RecyclerView.Adapter<ArrayViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArrayViewHolder {
        return ArrayViewHolder(parent.inflate(R.layout.item_article))
    }

    override fun onBindViewHolder(holder: ArrayViewHolder, position: Int) {
        val community=articleList[position]
        holder.bind(community, onClick)
    }
    override fun getItemCount(): Int =articleList.size

}
class ArrayViewHolder(view: View): RecyclerView.ViewHolder(view){
    fun bind(community: Community, onClick:(Community)-> Unit){
        itemView.imageView.load(community.banner)
        itemView.imageView.load(community.leader)
        //itemView.textViewTitle.text=array.title


        itemView.setOnClickListener{
            onClick(community)


        }
    }
}