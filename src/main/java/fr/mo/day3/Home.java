package fr.mo.day3;

public class Home {

    private Coordinates coordinates;
    private int SantaNumberOfVisits;

    public Home(Coordinates coordinates, int SantaNumberOfVisits) {
        this.coordinates = coordinates;
        this.SantaNumberOfVisits = SantaNumberOfVisits;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public int getSantaNumberOfVisits() {
        return SantaNumberOfVisits;
    }

    public int setSantaNumberOfVisits(int santaNumberOfVisits) {
        SantaNumberOfVisits = santaNumberOfVisits;
        return SantaNumberOfVisits;
    }

    @Override
    public String toString() {
        return "Home{" +
                "coordinates=" + coordinates +
                ", SantaNumberOfVisits=" + SantaNumberOfVisits +
                '}';
    }
}
