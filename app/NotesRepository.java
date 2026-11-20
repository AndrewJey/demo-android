package com.andrewjey.demoandroid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Controlador de notas de referencia para Demo Android (lógica portable compilable en JDK).
 */
public class NotesRepository {
    private final List<String> notes = new ArrayList<String>();

    public boolean addNote(String text) {
        if (text == null || text.trim().isEmpty()) {
            return false;
        }
        notes.add(0, text.trim());
        return true;
    }

    public boolean removeAt(int index) {
        if (index < 0 || index >= notes.size()) {
            return false;
        }
        notes.remove(index);
        return true;
    }

    public List<String> listNotes() {
        return Collections.unmodifiableList(notes);
    }

    public int count() {
        return notes.size();
    }
}
