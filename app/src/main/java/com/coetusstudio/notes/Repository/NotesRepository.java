package com.coetusstudio.notes.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.coetusstudio.notes.Dao.NotesDao;
import com.coetusstudio.notes.Database.NotesDatabase;
import com.coetusstudio.notes.Model.Notes;

import java.util.List;

public class NotesRepository {

    public NotesDao notesDao;

    public LiveData<List<Notes>> getAllNotes;
    public NotesRepository(Application application){

        NotesDatabase notesDatabase = NotesDatabase.getDatabaseInstance(application);
        notesDao = notesDatabase.notesDao();
        getAllNotes = notesDao.getAllNotes();
    }

    public void insertNotes(Notes notes){
        notesDao.insertNotes(notes);
    }

    public void deleteNotes(int id){
        notesDao.deleteNotes(id);
    }

    public void updateNotes(Notes notes){
        notesDao.updateNotes(notes);
    }
}
