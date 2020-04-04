package com.example.praktek_9_online

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import android.widget.Toast


class TigaFragment : Fragment(){
    private var comViewModel: ComViewModel? = null
    private var txtName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comViewModel = ViewModelProviders.of(requireActivity()).   get(ComViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?     ): View? {
        return inflater.inflate(R.layout.fragment_tiga, container, false)
        //val btn = view!!.findViewById(R.id.tagar) as Button
        //btn.setOnClickListener(object: View.OnClickListener {
            //override fun onClick(v: View?) {
                //Toast.makeText(getContext(), "This is from Fragment!", Toast.LENGTH_LONG).show()
         //   }
       // })

    }


    companion object {

        fun newInstance(): TigaFragment{
            return TigaFragment()         }
    }
}

