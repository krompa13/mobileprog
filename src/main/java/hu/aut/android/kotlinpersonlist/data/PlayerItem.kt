package hu.aut.android.kotlinpersonlist.data

import java.io.Serializable

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "playeritem")
data class PlayerItem(@PrimaryKey(autoGenerate = true) var playerId: Long?,
                      @ColumnInfo(name = "name") var name: String,
                      @ColumnInfo(name = "goals") var goals: Int,
                      @ColumnInfo(name = "active") var active: Boolean,
                      @ColumnInfo(name = "team") var team: String
) : Serializable