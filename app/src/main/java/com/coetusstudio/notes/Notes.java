package com.coetusstudio.notes;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notes_Database")

public class Notes {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "notes_Title")
    String notesTitle;

    @ColumnInfo(name = "notes_SubTitle")
    String notesSubTitle;

    @ColumnInfo(name = "notes_Priority")
    String notesPriority;

    @ColumnInfo(name = "notes_Description")
    String notesDescription;

    @ColumnInfo(name = "notes_Date")
    String notesDate;


}
