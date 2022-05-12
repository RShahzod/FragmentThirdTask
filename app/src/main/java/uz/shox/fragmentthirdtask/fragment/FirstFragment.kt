package uz.shox.fragmentthirdtask.fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.shox.fragmentthirdtask.R
import uz.shox.fragmentthirdtask.adapter.ContactAdapter
import uz.shox.fragmentthirdtask.model.User

class FirstFragment:Fragment() {
    private var listener: FirstListener? = null
    override fun onCreateView(inflater: LayoutInflater, con: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_first,con,false)
        initView(view)
        return view
    }
    private fun initView(view: View){
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val user : ArrayList<User> = ArrayList()
        user.add(User(R.drawable.lambo,"Lambo","+998997713834"))
        user.add(User(R.drawable.andro,"Shahzod","+998997777777"))
        user.add(User(R.drawable.bmw,"BMW","+998997777777"))
        user.add(User(R.drawable.ferra,"Ferrari","+998997777777"))
        user.add(User(R.drawable.fourcade,"Fourcade","+998997777777"))
        user.add(User(R.drawable.bill,"Bill Gates","+998997777777"))
        user.add(User(R.drawable.lambo,"Lambo","+998997713834"))
        user.add(User(R.drawable.andro,"Shahzod","+998997777777"))
        user.add(User(R.drawable.bmw,"BMW","+998997777777"))
        user.add(User(R.drawable.ferra,"Ferrari","+998997777777"))
        user.add(User(R.drawable.fourcade,"Fourcade","+998997777777"))
        user.add(User(R.drawable.bill,"Bill Gates","+998997777777"))

        val contactAdapter = listener?.let { ContactAdapter(requireContext(),user, it) }
        recyclerView.adapter = contactAdapter

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        listener = if (context is FirstListener) {
            context
        } else {
            throw RuntimeException("$context must implement FirstListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        listener = null
    }
    interface FirstListener {
        fun onFirstSend(user: User?)
    }
}