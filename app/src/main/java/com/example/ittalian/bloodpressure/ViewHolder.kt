package com.example.ittalian.bloodpressure

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//class ViewHolder(itemView: View){
    var dateText: TextView? = null
    var minMaxText: TextView? = null
    var pulseText: TextView? = null

    init {
        dateText = itemView.findViewById(R.id.dateText)
        minMaxText = itemView.findViewById(R.id.minMaxText)
        pulseText = itemView.findViewById(R.id.pulseText)
    }
}