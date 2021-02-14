package fr.busin.tablayout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import fr.busin.tablayout.R

class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_first, container, false)

        //Récuperation du textview present dans le layout fragment_first
        val textView: TextView = root.findViewById(R.id.section_label)
        textView.text = "First Fragment"

        return root
    }
}