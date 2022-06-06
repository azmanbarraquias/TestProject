package com.example.prototypeui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class live_fragment : Fragment() {
    private val data = ArrayList<ItemData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view: View = inflater.inflate(R.layout.live_fragment, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = RecyclerViewAdapter(data)

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter

        AddDataOnData()
        return view
    }

    private fun AddDataOnData() {
        for (i in 1..20) {
            data.add(ItemData("Item # ${i}"))
        }
    }
}