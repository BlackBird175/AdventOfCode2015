package fr.mo.day2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {

    public void readFile() throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("/home/kandinsky/Documents/CodeExos" +
                "/AdventOfCode2015/src/main/java/fr/mo/day2/Operations.txt")) ;
        int finalResult = 0;
        int rubberResult = 0;

        for(String line = reader.readLine(); line!=null; line = reader.readLine()) {

            List<Integer> dimensions  = new ArrayList<>();
            String [] dimensionsStr = line.split("x");

            int a = Integer.parseInt(dimensionsStr[0]);
            int b = Integer.parseInt(dimensionsStr[1]);
            int c = Integer.parseInt(dimensionsStr[2]);

            dimensions.add(a);
            dimensions.add(b);
            dimensions.add(c);


            Collections.sort(dimensions);

            rubberResult += (2 * dimensions.get(0) + 2 * dimensions.get(1)) +
                    dimensions.get(0) * dimensions.get(1) * dimensions.get(2);

            finalResult += (2 * dimensions.get(0) * dimensions.get(1) + 2 * dimensions.get(1) * dimensions.get(2) +
                    2 * dimensions.get(2) * dimensions.get(0)) + dimensions.get(0) * dimensions.get(1);

        }

        System.out.println("The presents will need " + finalResult + " feets of paper and " + rubberResult +
                " feets of rubber");
    }
}
