package uz.shox.fragmentthirdtask.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.imageview.ShapeableImageView
import uz.shox.fragmentthirdtask.R
import uz.shox.fragmentthirdtask.model.User

class SecondFragment:Fragment() {

    var tv_second : TextView? = null
    var num_second : TextView? = null
    var profile : ShapeableImageView? = null
    override fun onCreateView(inflater: LayoutInflater, con: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_second,con,false)
        initView(view)
        return view


    }
    private fun initView(view: View){
        tv_second = view.findViewById(R.id.secondName)
        num_second = view.findViewById(R.id.secondNumber)
        profile = view.findViewById(R.id.secondProfile)


    }
    fun updateSecondText(user: User?) {
        tv_second!!.text = user!!.name
        num_second!!.text = user.number
        profile?.setImageResource(user.profile)
    }
}