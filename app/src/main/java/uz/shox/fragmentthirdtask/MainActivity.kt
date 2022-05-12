package uz.shox.fragmentthirdtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.shox.fragmentthirdtask.adapter.ContactAdapter
import uz.shox.fragmentthirdtask.fragment.FirstFragment
import uz.shox.fragmentthirdtask.fragment.SecondFragment
import uz.shox.fragmentthirdtask.model.User

class MainActivity : AppCompatActivity(),FirstFragment.FirstListener {
    var firstFragment: FirstFragment? = null
    var secondFragment: SecondFragment? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = FirstFragment()
        secondFragment = SecondFragment()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.firstFragment, firstFragment!!)
            .replace(R.id.secondFragment, secondFragment!!)
            .commit()


    }

    override fun onFirstSend(user: User?) {
        secondFragment!!.updateSecondText(user)
    }
}