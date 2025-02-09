package fr.mo.day6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GridModel {

    private int [][] grid;

    public GridModel() {
        this.grid = new int[1000][1000];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public void readFile() throws IOException {
        String path = "/home/kandinsky/Documents/CodeExos/AdventOfCode2015/src/main/java/fr/mo/day6/instructions.txt";
        var lines = Files.readAllLines(Paths.get(path));

        Pattern pattern = Pattern.compile("(turn on|turn off|toggle) (\\d+),(\\d+) through (\\d+),(\\d+)");

        for (String line : lines) {
            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                String action = matcher.group(1);
                int x1 = Integer.parseInt(matcher.group(2));
                int y1 = Integer.parseInt(matcher.group(3));
                int x2 = Integer.parseInt(matcher.group(4));
                int y2 = Integer.parseInt(matcher.group(5));

                switch (action) {
                    case "turn off":
                        turnOffLights(x1, y1, x2, y2);
                        break;

                    case "turn on":
                        turnOnLights(x1, y1, x2, y2);
                        break;

                    case "toggle":
                        toggleLights(x1, y1, x2, y2);
                        break;
                }
            } else {
                System.out.println("Instruction invalide : " + line);
            }
        }
        printGrid();
        System.out.println(countOnLights());
    }

    public void printGrid() {
        for (int[] row : grid) {
            for (int light : row) {
                System.out.print(light > 0 ? "⬛" : "⬜");
            }
            System.out.println();
        }
    }

    public void turnOffLights(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                if (grid[i][j] > 0) {
                    grid[i][j] -= 1; // erreur corrigée
                }
            }
        }
    }

    public void turnOnLights(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                grid[i][j] += 1;
            }
        }
    }

    public void toggleLights(int x1, int y1, int x2, int y2) {
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                grid[i][j] += 2;
            }
        }
    }

    public int countOnLights() {

        int brightnessCounter = 0;

        for (int[] ints : grid) {
            for (int nb : ints) {
                brightnessCounter += nb;
            }
        }
        return brightnessCounter;
    }
}
