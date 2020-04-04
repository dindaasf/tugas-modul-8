package com.example.praktek_9_online

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class DuaFragment : Fragment() {
    private var comViewModel: ComViewModel? = null
    private var txtName: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comViewModel = ViewModelProviders.of(requireActivity()).
            get(ComViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dua,
            container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        txtName = view.findViewById(R.id.textViewName)
        comViewModel!!.name.observe(requireActivity(),
            Observer { s -> txtName!!.text = s })
    }
    companion object {
        fun newInstance(): DuaFragment {
            return DuaFragment()
        }
    }
}