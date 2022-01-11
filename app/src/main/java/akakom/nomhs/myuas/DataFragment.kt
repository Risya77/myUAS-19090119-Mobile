package akakom.nomhs.myuas

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_data.*

class DataFragment : Fragment() {
//tambah code
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val bind = bind
        // Inflate the layout for this fragment
//        next.setOnClickListener {
//            val intent = Intent(this@DataFragment.requireContext(), DataAlatMusik::class.java)
//            startActivity(intent)
//        }
        return view
    }
}
