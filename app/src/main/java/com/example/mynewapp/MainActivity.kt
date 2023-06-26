package com.example.mynewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mynewapp.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var instituteList : ArrayList<InstituteData>
    private lateinit var instituteAdapter: InstituteAdapter
    private lateinit var home: ImageView
    private lateinit var contacts: ImageView
    private lateinit var aboutUs: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home = findViewById(R.id.home)
        contacts = findViewById(R.id.contacts)
        aboutUs = findViewById(R.id.aboutUs)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        instituteList = ArrayList()


        instituteList.add(InstituteData(R.drawable.institute_logo, "Институт математики"))
        instituteList.add(InstituteData(R.drawable.institute_logo, "  Институт приоритетных технологий"))
        instituteList.add(InstituteData(R.drawable.institute_logo, "  Институт экономики и управления"))
        instituteList.add(InstituteData(R.drawable.institute_logo, "  Институт права"))
        instituteList.add(InstituteData(R.drawable.institute_logo, "  Институт естественных наук"))
        instituteList.add(InstituteData(R.drawable.institute_logo, "  Институт истории,межд ународных отношений и социальных технологий"))
        instituteList.add(InstituteData(R.drawable.institute_logo, "Test6"))


        instituteAdapter = InstituteAdapter(instituteList)
        recyclerView.adapter = instituteAdapter


        aboutUs.setOnClickListener {
            val intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }
    }


}








//    private lateinit var recyclerView: RecyclerView
//    private lateinit var searchView: SearchView
//    private var mList = ArrayList<InstituteData>()
//    private lateinit var adapter: InstituteAdapter
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        recyclerView = findViewById(R.id.recyclerView)
//        searchView = findViewById(R.id.searchView)
//
//        recyclerView.setHasFixedSize(true)
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        addDataToList()
//        adapter = InstituteAdapter(mList)
//        recyclerView.adapter = adapter
//
//    }
//
//    private fun filterList(query: String?) {
//
//        if (query != null) {
//            val filteredList = ArrayList<InstituteData>()
//            for (i in mList) {
//                if (i.title.lowercase(Locale.ROOT).contains(query)) {
//                    filteredList.add(i)
//                }
//            }
//
//            if (filteredList.isEmpty()) {
//                Toast.makeText(this, "No Data found", Toast.LENGTH_SHORT).show()
//            } else {
//                adapter.setFilteredList(filteredList)
//            }
//        }
//    }
//
//    private fun addDataToList() {
//        mList.add(InstituteData("Java", R.drawable.institute_logo))
//        mList.add(InstituteData("Kotlin", R.drawable.institute_logo))
//        mList.add(InstituteData("C++", R.drawable.institute_logo))
//        mList.add(InstituteData("Python", R.drawable.institute_logo))
//        mList.add(InstituteData("HTML", R.drawable.institute_logo))
//        mList.add(InstituteData("Swift", R.drawable.institute_logo))
//        mList.add(InstituteData("C#", R.drawable.institute_logo))
//        mList.add(InstituteData("JavaScript", R.drawable.institute_logo))
//    }
//}