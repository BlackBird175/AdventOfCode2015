package fr.mo.day3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {

    private final Map<String, Integer> homes;

    private final String path1 = "/home/kandinsky/Documents/CodeExos" +
            "/AdventOfCode2015/src/main/java/fr/mo/day3/directionsPart1.txt";

    private final String path2 = "/home/kandinsky/Documents/CodeExos" +
            "/AdventOfCode2015/src/main/java/fr/mo/day3/directionsPart2.txt";

    public Model() {
        homes = new HashMap<>();
    }

    public void homeCounter() throws IOException {

        List<String> line = Files.readAllLines(Paths.get(this.path2));

        Coordinates santaCoordinates = new Coordinates(0, 0);
        Coordinates roboSantaCoordinates = new Coordinates(0, 0);

        for (int i = 0; i < line.getFirst().length(); i++) {

            if (i % 2 != 0){
                instructionBehaviour(line.getFirst().charAt(i), santaCoordinates);
            }
            instructionBehaviour(line.getFirst().charAt(i), roboSantaCoordinates);
        }
        System.out.println(homes.size());
    }

    public void instructionBehaviour (char instruction, Coordinates coordinates){

        switch (instruction) {
            case '^' -> coordinates.setX(coordinates.getX() + 1);
            case '>' -> coordinates.setY(coordinates.getY() + 1);
            case 'v' -> coordinates.setX(coordinates.getX() - 1);
            case '<' -> coordinates.setY(coordinates.getY() - 1);
        }
        if (homes.containsKey(coordinates.toString())) {
            homes.replace(coordinates.toString(), homes.get(coordinates.toString()) + 1);
        }
        Home home = new Home(new Coordinates(coordinates.getX(), coordinates.getY()), 0);
        homes.put(home.getCoordinates().toString(), home.setSantaNumberOfVisits(home.getSantaNumberOfVisits() + 1));
    }
}