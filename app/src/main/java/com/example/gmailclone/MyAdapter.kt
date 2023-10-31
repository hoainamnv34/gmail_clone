package com.example.gmailclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

internal class MyAdapter(private val gmailList: List<GmailModel>,
                         private val context: Context
) : BaseAdapter() {


    private var layoutInflater: LayoutInflater? = null
    private lateinit var avtTV: TextView
    private lateinit var titleTV: TextView
    private lateinit var contentTV: TextView
    private lateinit var timeTV: TextView


    override fun getCount(): Int {
        return gmailList.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        var convertView = p1;

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }

        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.gmail_item, null)
        }

        avtTV = convertView!!.findViewById(R.id.avt)
        avtTV.text = gmailList[p0].avt
        titleTV = convertView!!.findViewById(R.id.title_gmail)
        titleTV.text = gmailList[p0].title
        contentTV = convertView!!.findViewById(R.id.content_gmail)
        contentTV.text = gmailList[p0].content
        timeTV = convertView!!.findViewById(R.id.time_gmail)
        timeTV.text = gmailList[p0].time

        return convertView;
    }

}