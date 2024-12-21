package fr.mo.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {

    public void readFile() throws IOException {
        int paperNeeded = 0;
        int ribbonNeeded = 0;

        String path = "/home/kandinsky/Documents/CodeExos/AdventOfCode2015/src/main/java/fr/mo/day2/operations.txt";
        var lines = Files.readAllLines(Paths.get(path));

        for (String line : lines) {
            String [] dimensionsStr = line.split("x");

            List<Integer> dimensions = new ArrayList<>();
            Collections.addAll(
                dimensions,
                Integer.parseInt(dimensionsStr[0]),
                Integer.parseInt(dimensionsStr[1]),
                Integer.parseInt(dimensionsStr[2])
            );
            //Sort acending order to get the value of extra paper and ribbon needed
            Collections.sort(dimensions);

            ribbonNeeded += (2 * dimensions.get(0) + 2 * dimensions.get(1)) +
                    dimensions.get(0) * dimensions.get(1) * dimensions.get(2);

            paperNeeded += (2 * dimensions.get(0) * dimensions.get(1) + 2 * dimensions.get(1) * dimensions.get(2) +
                    2 * dimensions.get(2) * dimensions.get(0)) + dimensions.get(0) * dimensions.get(1);
        }
        System.out.println("The presents will need " + paperNeeded + " feets of paper and " + ribbonNeeded +
                " feets of rubber");
    }
}