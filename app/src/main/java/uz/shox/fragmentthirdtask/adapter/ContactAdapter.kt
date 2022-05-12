package uz.shox.fragmentthirdtask.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.shox.fragmentthirdtask.R
import uz.shox.fragmentthirdtask.fragment.FirstFragment
import uz.shox.fragmentthirdtask.model.User

class ContactAdapter(private val context: Context, private val users:ArrayList<User>,var listener: FirstFragment.FirstListener): RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.contact_list,parent,false)

        return ConViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users[position]


        if (holder is ConViewHolder){
            holder.profile.setImageResource(user.profile)
            holder.name.text = user.name

            holder.layoutLin.setOnClickListener {
                listener.onFirstSend(user)
            }
        }

    }

    override fun getItemCount(): Int {
        return users.size
    }

    class ConViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val profile = itemView.findViewById<ImageView>(R.id.profile)!!
        val name = itemView.findViewById<TextView>(R.id.name)!!
        val layoutLin = itemView.findViewById<LinearLayout>(R.id.layoutLin)
    }

}