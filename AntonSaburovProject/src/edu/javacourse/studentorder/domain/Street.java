package edu.javacourse.studentorder.domain;

public class Street {
    private long streetCode;
    private String name;

    public Street(String s) {
    }

    public long getStreetCode() {
        return streetCode;
    }

    public void setStreetCode(long streetCode) {
        this.streetCode = streetCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Street(long streetCode, String name) {
        this.streetCode = streetCode;
        this.name = name;
    }

    public Street() {

    }

}
