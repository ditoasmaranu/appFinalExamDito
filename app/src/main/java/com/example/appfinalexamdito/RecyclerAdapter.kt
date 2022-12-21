package com.example.appfinalexamdito

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*




class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //image list
    private val images = intArrayOf(
        R.drawable.fcarddone,
        R.drawable.fcarddone,
        R.drawable.fcarddc
    )
    //title list
    private val titles = arrayOf(
        "Graylog",
        "Cacti",
        "PySpark"
    )
    //detail list
    private val details = arrayOf(
        "Dito's Centralization Log Project, this project is how dito have solution, if the hacker get into server and then install malicious software, and remove log" +
                "so the IRT ( or also know as  Incident Response Team )  can trace the server's log within  this centralization log",
        "Dito's Network Monitoring System, this server is one off dito's project, This project serves to provide network engineers to monitor traffic, latency, resources on a device. so that network engineers can perform early detection, preventive and even troubleshoot network problems",
        "Big Data Management system , and this second one isn't dito's project, but dito's assignment from Infrastucture Big Data's lecturer"
    )
    val linkked = arrayOf(
        "http://111.68.24.246:9000/",
        "http://119.2.54.54.8082/cacti",
        "http://111.68.24.246:8888/lab?token=cafaa1c638c348862dbbc46dc590dff0f9af68f4e6b7cc85"
    )

    //view Holder
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        init {
            itemImage = itemView.findViewById(R.id.cardImage)
            itemTitle = itemView.findViewById(R.id.cardTitle)
            itemDetail = itemView.findViewById(R.id.cardDetail)

//            itemView.setOnClickListener{v : View ->
//                var position: Int = getAdapterPosition()
//                Snackbar.make(v,"Click in item${titles[position]}",
//                    Snackbar.LENGTH_LONG).setAction("Action",null).show()
//
//
//            }
            itemView.setOnClickListener{v : View ->
                var position: Int = getAdapterPosition()
                Snackbar.make(v,"Click in item${titles[position]}",
                    Snackbar.LENGTH_LONG).setAction("Action",null).show()


            }

        }
    }




    override fun onCreateViewHolder(ViewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(ViewGroup.context)
            .inflate(R.layout.card_layout, ViewGroup, false)
        return ViewHolder(v)
    }
    override fun onBindViewHolder(viewHolder : ViewHolder, i: Int) {
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
    }

    override fun getItemCount(): Int {
        return titles.size
    }



}


