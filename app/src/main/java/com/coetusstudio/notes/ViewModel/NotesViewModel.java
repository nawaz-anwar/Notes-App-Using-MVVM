package com.coetusstudio.notes.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.coetusstudio.notes.Model.Notes;
import com.coetusstudio.notes.Repository.NotesRepository;

import java.util.List;

public class NotesViewModel extends AndroidViewModel {

    public NotesRepository notesRepository;
    public LiveData<List<Notes>> getAllNotes;

    public NotesViewModel(Application application) {
        super(application);

        notesRepository = new NotesRepository(application);
        getAllNotes = notesRepository.getAllNotes;
    }

    void insertNode(Notes notes){
        notesRepository.insertNotes(notes);
    }

    void deleteNote(int id){
        notesRepository.deleteNotes(id);
    }

    void updateNote(Notes notes){
        notesRepository.updateNotes(notes);
    }
}
