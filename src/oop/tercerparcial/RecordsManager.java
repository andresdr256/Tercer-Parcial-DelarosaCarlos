package oop.tercerparcial;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class RecordsManager {
    private File recordsFile;

    public RecordsManager(File recordsFile) {
        this.recordsFile = recordsFile;
    }

    public void save(GameRecord record) {
        
    }

    public List<GameRecord> list() {
        return null;
    }
}
