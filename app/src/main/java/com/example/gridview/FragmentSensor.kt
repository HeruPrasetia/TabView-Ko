package com.example.gridview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_sensor.view.*

class FragmentSensor : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val dataa = inflater.inflate(R.layout.fragment_sensor, container, false)
        dataa.btnTest.setOnClickListener {
            Toast.makeText(requireContext(),"hallo", Toast.LENGTH_SHORT).show()
        }
        return dataa
    }


}
