package pl.jakubkrys.notes_app;

import java.util.Arrays;

public class NotesRepo {

    private Note[] notes = new Note[100];
    private int index = 0;

    public void add(Note note){
        notes[index++] = note;
    }

    @Override
    public String toString() {
        return "NotesRepo{" +
                "notes=" + Arrays.toString(notes) +
                '}';
    }
}
