package fr.mo.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {

    private Map<String, Integer> homes;

    public Model() {
        homes = new HashMap<>();
    }

    public void homeCounter() throws IOException {

        String path = "/home/kandinsky/Documents/CodeExos/AdventOfCode2015/src/main/java/fr/mo/day3/directions.txt";
        List<String> line = Files.readAllLines(Paths.get(path));

        Coordinates santaCoordinates = new Coordinates(0, 0);

        for (int i = 0; i < line.getFirst().length(); i++) {

            switch (line.getFirst().charAt(i)) {
                case '^' -> santaCoordinates.setX(santaCoordinates.getX() + 1);
                case '>' -> santaCoordinates.setY(santaCoordinates.getY() + 1);
                case 'v' -> santaCoordinates.setX(santaCoordinates.getX() - 1);
                case '<' -> santaCoordinates.setY(santaCoordinates.getY() - 1);
            }
            if (homes.containsKey(santaCoordinates.toString())) {
                homes.replace(santaCoordinates.toString(), homes.get(santaCoordinates.toString()) + 1);
            }
            Home home = new Home(new Coordinates(santaCoordinates.getX(), santaCoordinates.getY()), 0);
            homes.put(home.getCoordinates().toString(), home.setSantaNumberOfVisits(home.getSantaNumberOfVisits() + 1));
        }
        System.out.println(homes.size());
    }
}
