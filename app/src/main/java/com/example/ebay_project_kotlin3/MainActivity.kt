package com.example.ebay_project_kotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_project_kotlin3.adapter.EssentialAdapter
import com.example.ebay_project_kotlin3.mobil.Essential

class MainActivity : AppCompatActivity() {

    lateinit var rv_essential: RecyclerView
    lateinit var l1_fashion: LinearLayout
    lateinit var l1_popular: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        l1_fashion = findViewById(R.id.ll_fashion)
        l1_popular = findViewById(R.id.l1_popular)
        rv_essential = findViewById(R.id.rv_essentialw)
        val manager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_essential.layoutManager = manager

        refreshAdapter(getEssentials())

        setLinearHeight(l1_fashion)
        setLinearHeight(l1_popular)
    }

    private fun setLinearHeight(layout: LinearLayout) {

        val displayMetrics = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(displayMetrics)
        var widthPixels = displayMetrics.widthPixels

        val params: ViewGroup.LayoutParams = layout.layoutParams
        params.height = widthPixels
        layout.layoutParams = params

    }

    fun refreshAdapter(items:ArrayList<Essential>,) {
        val adapter = EssentialAdapter(this,items)
        rv_essential!!.adapter = adapter
    }


    fun getEssentials(): ArrayList<Essential> {
        val items: ArrayList<Essential> = ArrayList()
        items.add(Essential("Bose QuietComfort",R.drawable.img21))
        items.add(Essential("AKG Y500 Wireless",R.drawable.img22))
        items.add(Essential("Bose QuietComfort",R.drawable.img19))
        items.add(Essential("AKG Y500 Wireless",R.drawable.img24))
        items.add(Essential("Bose QuietComfort",R.drawable.img25))
        items.add(Essential("AKG Y500 Wireless",R.drawable.img26))
        items.add(Essential("Bose QuietComfort",R.drawable.img27))
        items.add(Essential("AKG Y500 Wireless",R.drawable.img28))
        items.add(Essential("Bose QuietComfort",R.drawable.img16))
        items.add(Essential("AKG Y500 Wireless",R.drawable.img17))
        items.add(Essential("Bose QuietComfort",R.drawable.img18))
        items.add(Essential("AKG Y500 Wireless",R.drawable.img19))

        return items
    }
}