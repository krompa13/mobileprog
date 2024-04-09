package hu.aut.android.kotlinpersonlist.data

import android.arch.persistence.room.*

@Dao
interface PlayerItemDAO {

    //Az összes listázása
    @Query("SELECT * FROM playeritem")
    fun findAllItems(): List<PlayerItem>

    //Egy elem beszúrása
    @Insert
    fun insertItem(item: PlayerItem): Long
    //Egy törlése
    @Delete
    fun deleteItem(item: PlayerItem)
    //Egy módosítása
    @Update
    fun updateItem(item: PlayerItem)
}