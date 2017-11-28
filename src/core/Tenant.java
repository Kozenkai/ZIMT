package core;

import java.util.Date;

class Tenant {
    private String vorname;
    private String nachname;
    private Date mietdauer;
    private Boolean verzug;

    public Tenant(String vorname, String nachname, Date mietdauer, Boolean verzug) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.mietdauer = mietdauer;
        this.verzug = verzug;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Date getMietdauer() {
        return mietdauer;
    }

    public void setMietdauer(Date mietdauer) {
        this.mietdauer = mietdauer;
    }

    public Boolean getVerzug() {
        return verzug;
    }

    public void setVerzug(Boolean verzug) {
        this.verzug = verzug;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tenant)) return false;

        Tenant tenant = (Tenant) o;

        if (getVorname() != null ? !getVorname().equals(tenant.getVorname()) : tenant.getVorname() != null)
            return false;
        if (getNachname() != null ? !getNachname().equals(tenant.getNachname()) : tenant.getNachname() != null)
            return false;
        if (getMietdauer() != null ? !getMietdauer().equals(tenant.getMietdauer()) : tenant.getMietdauer() != null)
            return false;
        return getVerzug() != null ? getVerzug().equals(tenant.getVerzug()) : tenant.getVerzug() == null;
    }

    @Override
    public int hashCode() {
        int result = getVorname() != null ? getVorname().hashCode() : 0;
        result = 31 * result + (getNachname() != null ? getNachname().hashCode() : 0);
        result = 31 * result + (getMietdauer() != null ? getMietdauer().hashCode() : 0);
        result = 31 * result + (getVerzug() != null ? getVerzug().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", mietdauer=" + mietdauer +
                ", verzug=" + verzug +
                '}';
    }
}
