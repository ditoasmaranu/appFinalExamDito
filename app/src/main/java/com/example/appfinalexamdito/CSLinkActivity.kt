package com.example.appfinalexamdito

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CSLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cslink)
    }
    fun toGrayLog(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "http://111.68.24.246:9000/";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }
    fun toPySpark(view: View){
        //berfungsi membuat variabel url dan diisi dengan String url artikel
        var url = "http://111.68.24.246:8888/lab";
        //berfungsi untuk membuat intent implicit
        startActivity(
            Intent(Intent.ACTION_VIEW).apply
            {
                //untuk memanggil fungsi parse pada class Uri dengan parameter isi dari variabel url
                data = Uri.parse(url)
            })
    }

}