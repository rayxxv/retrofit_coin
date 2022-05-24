package com.example.retrofitcoin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofitcoin.data.pojo.Movie

class MoviesAdapter(private val listMovies: List<Movie>): RecyclerView.Adapter<MoviesAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val tvTitle = holder.itemView.findViewById<TextView>(R.id.tv_title_movie)
        tvTitle.text = listMovies[position].title
    }

    override fun getItemCount(): Int {
        return listMovies.size
    }
}