package oop.tercerparcial;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

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

            fw.append(String.valueOf(record.getScore())).append(",").append(record.getPlayerName()).append("\n");

            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<GameRecord> list() throws IOException {
        List<GameRecord> records = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(recordsFile.getAbsolutePath()))) {
            String line;
            line = br.readLine();

            while (line != null) {
                String[] attributes = line.split(",");
                line = br.readLine();
                GameRecord record = new GameRecord(Integer.parseInt(attributes[0]),attributes[1]);
                records.add(record);
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }

        return records;
    }
}
