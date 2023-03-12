package seminar6.hw2_notebook;

import seminar6.hw2_notebook.controller.NotepadController;
import seminar6.hw2_notebook.models.*;
import seminar6.hw2_notebook.view.NotepadView;

public class Main {
    public static void main(String[] args) {
        JsonDb jsonDb = new JsonDb("seminar6/hw2_notebook/notes.json");
        TxtDb txtDb = new TxtDb("seminar6/hw2_notebook/notes/");
        Logable logger = new TxtLogger("seminar6/hw2_notebook/log.txt");
        Repositoriable<Note> notesRepo = new RepoWLog(logger, jsonDb, txtDb);
        NotepadController controller = new NotepadController(notesRepo);
        NotepadView view = new NotepadView(controller);
        view.run();
    }
}
