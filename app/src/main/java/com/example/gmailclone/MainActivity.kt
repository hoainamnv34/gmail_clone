package com.example.gmailclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var gmailLV: ListView
    lateinit var gmailList: List<GmailModel>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gmailLV = findViewById(R.id.gmailList)

        gmailList = ArrayList<GmailModel>();
        gmailList = gmailList + GmailModel("I", "12:00 PM", "IntelliJ IDEA Digest: October 2023","Welcome to the October edition of the IntelliJ IDEA digest! We've got a fantastic lineup for you this month! It includes the latest updates on our AI Assistant and an introduction to the key features of the HTTP Client. You’ll also get a valuable tip on visualizing configuration file dependencies, as well as our recorded webinar on Maven collaboration tips and tricks." );
        gmailList = gmailList + GmailModel("C","6:00 AM","Sky Pass – Bay càng nhiều, giá càng yêu", "Vietnam Airlines mới cho ra mắt sản phẩm mới Sky Pass - là gói vé máy bay định danh dành cho hội viên Bông Sen Vàng. Mỗi gói Sky Pass bao gồm một số chuyến bay khứ hồi với hành trình xác định trước trong vòng 12 tháng kể từ thời điểm mua gói.");
        gmailList = gmailList + GmailModel("A", "5:12 PM","Awesome News - October Edition", "Launching Podcast Awesome has been a boo-tiful experience — and we’re just getting the party started. And since we like to creep it real, the fa-skele-fun crew are giving out Halloween themed icons like");

        val gmailAdapter = MyAdapter(gmailList = gmailList, this@MainActivity)

        gmailLV.adapter = gmailAdapter;

    }
}