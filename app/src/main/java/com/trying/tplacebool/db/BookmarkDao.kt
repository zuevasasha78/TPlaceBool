package com.trying.tplacebool.db

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.OnConflictStrategy.REPLACE
import com.trying.tplacebool.model.Bookmark

@Dao
interface BookmarkDao {

    @Query("SELECT * FROM Bookmark")
    fun loadAll(): LiveData<List<Bookmark>>

    @Query("SELECT * FROM Bookmark WHERE id = :bookmarkId")
    fun loadBookmark(bookmarkId: Long): Bookmark

    @Query("SELECT * FROM Bookmark WHERE id = :bookmarkId")
    fun loadLiveBookmark(bookmarkId: Long):LiveData<Bookmark>

    @Insert(onConflict = REPLACE)
    fun insertBookmark(bookmark: Bookmark) : Long

    @Update(onConflict = REPLACE)
    fun updateBookmark(bookmark: Bookmark)

    @Delete
    fun deleteBookmark(bookmark: Bookmark)
}