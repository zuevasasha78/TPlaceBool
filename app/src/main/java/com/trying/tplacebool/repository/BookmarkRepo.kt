package com.trying.tplacebool.repository

import android.content.Context
import androidx.lifecycle.LiveData
import com.trying.tplacebool.db.BookmarkDao
import com.trying.tplacebool.db.PlaceBookDatabase
import com.trying.tplacebool.model.Bookmark

class BookmarkRepo(context: Context) {

    private var db = PlaceBookDatabase.getInstance(context)
    private var bookmarkDao: BookmarkDao = db.bookmarkDao()

    fun addBookmark(bookmark: Bookmark): Long? {
        val newId = bookmarkDao.insertBookmark(bookmark)
        bookmark.id = newId
        return newId
    }


    fun createBookmark(): Bookmark {
        return Bookmark()
    }

    val allBookmarks: LiveData<List<Bookmark>>
        get() {
            return bookmarkDao.loadAll()
        }
}