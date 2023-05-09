package com.example.jobsheet20zulfa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<siswa>()
    val listnama = arrayOf(
        "SALMA NADIA AGUSTIN",
        "SALMA VILINDIA PUTRI",
        "SILVI WIDYA MAULANI",
        "SITI KOTIJAH",
        "VIVI NUR AISYAH",
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI WIRATAMA",
        "DANUARDI WAHYU"
    )

    val listNis = arrayOf(
        "3028",
        "3029",
        "3031",
        "3033",
        "3035",
        "3039",
        "2973",
        "2974",
        "2977",
        "2979",
        "2981"
    )

    lateinit var makananView: RecyclerView
    lateinit var  makananAdapter: makananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makananView = findViewById(R.id.nama)
        makananView.layoutManager = LinearLayoutManager( this)

        for (i in listnama.indices){
            list.add(siswa(listnama[i], listNis[i]))
        }

        makananAdapter = makananAdapter(list)
        makananAdapter.notifyDataSetChanged()
        makananView.adapter = makananAdapter
    }
}