package com.example.mynotes;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NotesDao {

    @Insert
    void insertNote(Notes notes);

    @Query("Select * from Notes")
    List<Notes> getAllNotes();

    @Delete
    void deleteNote(Notes notes);

}