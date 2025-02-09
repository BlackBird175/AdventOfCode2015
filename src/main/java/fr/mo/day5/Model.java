package fr.mo.day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Model {

    public void readFile() throws IOException {
        String path = "/home/kandinsky/Documents/CodeExos/AdventOfCode2015/src/main/java/fr/mo/day5/puzzleInput.txt";
        boolean isNice = false;
        int niceCounter = 0;
        var lines = Files.readAllLines(Paths.get(path));

        for (String line : lines) {
            if (isTwoSequencesRepeats(line) && hasRepeatingLetterWithOneBetween(line)) {
                isNice = true;
                niceCounter++;
            }
        }
        System.out.println("Nice: " + niceCounter + ", not nice : " + (lines.size() - niceCounter));
    }

    public boolean doesNotContainForbiddenSequence(String line) {
        return !line.contains("ab") && !line.contains("cd") && !line.contains("pq") && !line.contains("xy");
    }

    public boolean isAtLeastThreeVowels(String line) {
        long count = line.chars().filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u').count();
        return count >= 3;
    }

    public boolean isTwoLettersInARow(String line) {
        for (int i = 0; i < line.length() - 1; i++) {
            String sequence = String.valueOf(line.charAt(i) + line.charAt(i+1));
            if (line.contains(sequence)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoSequencesRepeats(String line) {
        for (int i = 0; i < line.length() - 1; i++) {
            String sequence = line.substring(i, i + 2);
            if (line.indexOf(sequence, i + 2) != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean hasRepeatingLetterWithOneBetween(String line) {
        for (int i = 0; i < line.length() - 2; i++) {
            if (line.charAt(i) == line.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }
}