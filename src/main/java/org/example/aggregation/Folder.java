package org.example.aggregation;

import java.util.*;

public class Folder {
    List<File> files = new ArrayList<>();

    public Folder() {
        for (int x = 1; x <= 10; x++) {
            files.add(new File());  //Composition
        }
        System.out.println("Number of files: " + files.size());
    }

    public Folder (File[] f) {
        for (int x = 0; x < f.length; x++) {    //Can do Collections.addAll(files, f); instead of for loop
            files.add(f[x]);        //Aggregation (not Composition)
        }
        System.out.println("Number of files: " + files.size());
    }
}
