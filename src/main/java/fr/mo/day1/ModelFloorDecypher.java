package fr.mo.day1;

public class ModelFloorDecypher {

    private final Instructions instructionsObj = new Instructions();
    private final String instructionsStr = instructionsObj.getINSTRUCTIONS();

    public int decypherInstruction() {

        int floor = 0;

        for (int i = 0; i < this.instructionsStr.length(); i++) {
            if (this.instructionsStr.charAt(i) == '(') {
                floor++;
            }
            else
                floor--;
        }
        return floor;
    }

    public int getFirstInstructionToBasementPosition() {

        int floor = 0;
        int firstInstructionToBasement = 0;

        for (int i = 0; i < this.instructionsStr.length() && floor != -1; i++) {
            if (this.instructionsStr.charAt(i) == '(') {
                floor++;
            }
            else
                floor--;

            if (floor == -1){
                firstInstructionToBasement = i + 1;
            }
        }
        return firstInstructionToBasement;
    }


}