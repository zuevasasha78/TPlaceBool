package com.trying.tplacebool.adapter

import android.app.Activity
import android.view.View
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import com.trying.tplacebool.R

class BookmarkInfoWindowAdapter(context: Activity) : GoogleMap.InfoWindowAdapter {
    private val contents: View

    init {
        contents = context.layoutInflater.inflate(
            R.layout.content_bookmark_info, null
        )
    }

    override fun getInfoContents(p0: Marker?): View? {
       // val tit
        return null

    }

    override fun getInfoWindow(p0: Marker?): View? {
        return null
    }
}