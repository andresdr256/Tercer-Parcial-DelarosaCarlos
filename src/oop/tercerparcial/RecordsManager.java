package oop.tercerparcial;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RecordsManager {
    private final File recordsFile;

    public RecordsManager(File recordsFile) {
        this.recordsFile = recordsFile;
    }

    public void save(GameRecord record) {
        try {
            if (record.getScore() <= 0)
                throw new NegativeScoreException();

            if (record.getPlayerName() == null)
                throw new InvalidPlayerNameException();

            if (record.getPlayerName().length() < 1)
                throw new InvalidPlayerNameException();

            FileWriter fw = new FileWriter(recordsFile, true);

            fw.append(String.valueOf(record.getScore())).append(",").append(record.getPlayerName());

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<GameRecord> list() throws IOException {
        List<GameRecord> records = null;
        List<String> lines = Files.readAllLines(Paths.get(recordsFile.getAbsolutePath()));
        Iterator<String> linesIterator = lines.iterator();
        while (linesIterator.hasNext()) {
            System.out.println("lines: " + lines);
            linesIterator.next();
        }
        return records;
    }
}
