package core;

import java.util.ArrayList;
import java.util.Date;

class House {

    private ArrayList<Apartment> apartments;
    private Date lastCleaned;
    private double basementSize;
    private Address address;

    House(ArrayList<Apartment> apartments, Date lastCleaned, double basementSize, Address address) {
        this.apartments = apartments;
        this.lastCleaned = lastCleaned;
        this.basementSize = basementSize;
        this.address = address;
    }

    Address getAddress() {
        return address;
    }

    void setAddress(Address address) {
        this.address = address;
    }

    double getBasementSize() {
        return basementSize;
    }

    void setBasementSize(double basementSize) {
        this.basementSize = basementSize;
    }

    Date getLastCleaned() {
        return lastCleaned;
    }

    void setLastCleaned(Date lastCleaned) {
        this.lastCleaned = lastCleaned;
    }

    ArrayList<Apartment> getApartments() {
        return apartments;
    }

    void setApartments(ArrayList<Apartment> apartments) {
        this.apartments = apartments;
    }

    @Override
    public String toString() {
        return "House{" +
                "apartments=" + apartments +
                ", lastCleaned=" + lastCleaned +
                ", basementSize=" + basementSize +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;

        House house = (House) o;

        return Double.compare(house.getBasementSize(),getBasementSize()) == 0 &&
               getApartments().equals(house.getApartments()) &&
               (getLastCleaned() != null ? getLastCleaned().equals(house.getLastCleaned()) : house.getLastCleaned() == null) &&
               getAddress().equals(house.getAddress());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getApartments().hashCode();
        result = 31 * result + (getLastCleaned() != null ? getLastCleaned().hashCode() : 0);
        temp = Double.doubleToLongBits(getBasementSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAddress().hashCode();
        return result;
    }
}
