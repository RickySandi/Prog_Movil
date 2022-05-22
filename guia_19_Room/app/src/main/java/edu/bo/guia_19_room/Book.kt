package edu.bo.guia_19_room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//class Book {
//}

@Entity(tableName = "book_table")
class Book(@ColumnInfo(name = "title") var title: String) {
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id")
    var id: Long = 0
}


