package fr.mo.day1;

public class ModelFloorDecypher {

    private final Instructions instructions = new Instructions();
    private final String instruction = instructions.getINSTRUCTIONS();

    public int DecypherInstruction() {

        String instructions = this.instruction;
        int floor = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == '(') {
                floor++;
            }
            else
                floor--;

            if (floor == -1){
                System.out.println(i+1);
            }
        }
        return floor;
    }

    public int getFirstInstructionToBasementPosition() {

        String instructions = this.instruction;
        int floor = 0;
        int firstInstructionToBasement = 0;

        for (int i = 0; i < instructions.length() && floor != -1; i++) {
            if (instructions.charAt(i) == '(') {
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