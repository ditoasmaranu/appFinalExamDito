package com.example.appfinalexamdito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
//test
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun toCloudServerList(view: View) {
        //berfungsi membuat variabel intent dengan dan diisi dengan menggunakan sintaks dari
        //pemanggilan function Intent dengan memanggil class CloudServerActivity
        val intent = Intent(this@MainActivity, CloudServerActivity::class.java)
        //memanggil function startActivity dengan paramater nilai dari variabel intent
        startActivity(intent)
    }
    fun toLinkCS(view: View) {
        //berfungsi membuat variabel intent dengan dan diisi dengan menggunakan sintaks dari
        //pemanggilan function Intent dengan memanggil class CSLinkActivity
        val intent = Intent(this@MainActivity, CSLinkActivity::class.java)
        //memanggil function startActivity dengan paramater nilai dari variabel intent
        startActivity(intent)
    }

    fun toQuotesTab(view: View) {
        //berfungsi membuat variabel intent dengan dan diisi dengan menggunakan sintaks dari
        //pemanggilan function Intent dengan memanggil class ListQuotesActivity
        val intent = Intent(this@MainActivity, ListQuotesActivity::class.java)
        //memanggil function startActivity dengan paramater nilai dari variabel intent
        startActivity(intent)
    }
}