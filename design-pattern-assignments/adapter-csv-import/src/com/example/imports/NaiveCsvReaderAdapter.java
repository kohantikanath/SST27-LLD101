package com.example.imports;

import java.nio.file.Path;
import java.util.List;

public class NaiveCsvReaderAdapter implements ProfileImporter {
    private final NaiveCsvReader naiveCsvReader;
    private final ProfileService profileService;

    public NaiveCsvReaderAdapter(NaiveCsvReader naiveCsvReader, ProfileService profileService){
        this.naiveCsvReader = naiveCsvReader;
        this.profileService = profileService;

    }

    public int importFrom (Path path){
        List<String[]> rows = naiveCsvReader.read(path);
        for (String[] row : rows) {
            if(row[0].equals("id")) continue; // skip header
            if (row.length != 3) {
                System.err.println("Skipping invalid row: " + String.join(", ", row));
                continue;
            }
            profileService.createProfile(row[0], row[1], row[2]);
        }
        return rows.size()-1;
    }
    
}
