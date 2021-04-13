package com.alexux.alexux.designapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TableLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.alexux.alexux.designapplication.adapters.RecyclerViewAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        var tabLayout: TabLayout = findViewById(R.id.tabLayout)
        var imagesOnDrive = arrayOf("Image1","Image2","Image1","Image2","Image2","Image1")
        var imagesOnDevice = arrayOf("Image2","Image1","Image1","Image2","Image1","Image1")
//        TabLayoutMediator(tabLayout, )
        recyclerView.adapter = RecyclerViewAdapter(arrayOf("File","File1","File2","File3","File4","File5"),
            arrayOf("Type1","Type2","Type1","Type1","Type2","Type2"),
            arrayOf("Image1","Image2","Image1","Image2","Image2","Image1"))
        recyclerView.layoutManager = GridLayoutManager(this, 2)
    }
}