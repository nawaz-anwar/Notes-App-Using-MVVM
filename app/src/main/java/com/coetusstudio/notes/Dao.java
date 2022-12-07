package com.coetusstudio.notes;

import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

@androidx.room.Dao
public interface Dao {

    @Query("SELECT * FROM Notes_Database")
    ArrayList<Notes> getAllNotes();

    @Insert
    void insertNotes(Notes... notes);

    @Query("DELETE FROM Notes_Database WHERE id=:id")
    void deleteNotes(int id);

    @Update
    void updateNotes(Notes notes);
}
