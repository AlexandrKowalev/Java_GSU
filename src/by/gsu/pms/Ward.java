package by.gsu.pms;

import java.io.Serializable;

public class Ward implements Serializable {

    private static final long serialVersionUID = 1L;
    private String doctorName;
    private int numberOfSeats;
    private boolean freePlaces;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(boolean freePlaces) {
        this.freePlaces = freePlaces;
    }

    public Ward() {
        super();
    }

    public Ward(String doctorName, int numberOfSeats, boolean freePlaces) {
        this.doctorName = doctorName;
        this.numberOfSeats = numberOfSeats;
        this.freePlaces = freePlaces;
    }

    @Override
    public String toString() {
        return doctorName + ", " + numberOfSeats + "," + freePlaces;
    }

}