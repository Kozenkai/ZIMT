package core;


public class Adress {


    private String strasse;
    private String hausnr;
    private String plz;
    private String zusatz;

    public Adress(String strasse, String hausnr, String plz, String zusatz) {
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.zusatz = zusatz;
    }

    public String getZusatz() {

        return zusatz;
    }

    public void setZusatz(String zusatz) {
        this.zusatz = zusatz;
    }

    public String getPlz() {

        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getHausnr() {

        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public String getStrasse() {

        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "strasse='" + strasse + '\'' +
                ", hausnr='" + hausnr + '\'' +
                ", plz='" + plz + '\'' +
                ", zusatz='" + zusatz + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adress)) return false;

        Adress adress = (Adress) o;

        if (getStrasse() != null ? !getStrasse().equals(adress.getStrasse()) : adress.getStrasse() != null)
            return false;
        if (getHausnr() != null ? !getHausnr().equals(adress.getHausnr()) : adress.getHausnr() != null)
            return false;
        if (getPlz() != null ? !getPlz().equals(adress.getPlz()) : adress.getPlz() != null) return false;
        return getZusatz() != null ? getZusatz().equals(adress.getZusatz()) : adress.getZusatz() == null;
    }

    @Override
    public int hashCode() {
        int result = getStrasse() != null ? getStrasse().hashCode() : 0;
        result = 31 * result + (getHausnr() != null ? getHausnr().hashCode() : 0);
        result = 31 * result + (getPlz() != null ? getPlz().hashCode() : 0);
        result = 31 * result + (getZusatz() != null ? getZusatz().hashCode() : 0);
        return result;
    }
}