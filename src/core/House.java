package core;

import java.util.ArrayList;
import java.util.Date;

class House {

    private ArrayList<Apartment> wohnungen;
    private Date reinigungsDatum;
    private double kellerFlaeche;
    private Adress adress;

    public House(ArrayList<Apartment> wohnungen, Date reinigungsDatum, double kellerFlaeche, Adress adress) {
        this.wohnungen = wohnungen;
        this.reinigungsDatum = reinigungsDatum;
        this.kellerFlaeche = kellerFlaeche;
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public double getKellerFlaeche() {

        return kellerFlaeche;
    }

    public void setKellerFlaeche(double kellerFlaeche) {
        this.kellerFlaeche = kellerFlaeche;
    }

    public Date getReinigungsDatum() {

        return reinigungsDatum;
    }

    public void setReinigungsDatum(Date reinigungsDatum) {
        this.reinigungsDatum = reinigungsDatum;
    }

    public ArrayList<Apartment> getWohnungen() {

        return wohnungen;
    }

    public void setWohnungen(ArrayList<Apartment> wohnungen) {
        this.wohnungen = wohnungen;
    }

    @Override
    public String toString() {
        return "House{" +
                "wohnungen=" + wohnungen +
                ", reinigungsDatum=" + reinigungsDatum +
                ", kellerFlaeche=" + kellerFlaeche +
                ", adress=" + adress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;

        House house = (House) o;

        if (Double.compare(house.getKellerFlaeche(), getKellerFlaeche()) != 0) return false;
        if (!getWohnungen().equals(house.getWohnungen())) return false;
        return (getReinigungsDatum() != null ? getReinigungsDatum().equals(house.getReinigungsDatum()) : house.getReinigungsDatum() == null) && getAdress().equals(house.getAdress());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getWohnungen().hashCode();
        result = 31 * result + (getReinigungsDatum() != null ? getReinigungsDatum().hashCode() : 0);
        temp = Double.doubleToLongBits(getKellerFlaeche());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAdress().hashCode();
        return result;
    }
}
