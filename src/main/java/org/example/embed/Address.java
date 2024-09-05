package org.example.embed;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private int no;
    private String lane;
    private String town;

    public Address() {
    }

    public Address(int no, String lane, String town) {
        this.no = no;
        this.lane = lane;
        this.town = town;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getLane() {
        return lane;
    }

    public void setLane(String lane) {
        this.lane = lane;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
