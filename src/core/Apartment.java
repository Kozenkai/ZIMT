package core;

class Apartment {
    private double rent;
    private Tenant tenant;
    private double rooms;
    private double size;
    private boolean balcony;

    Apartment(double rent, Tenant tenant, double rooms, double size, boolean balcony) {
        this.rent = rent;
        this.tenant = tenant;
        this.rooms = rooms;
        this.size = size;
        this.balcony = balcony;
    }

    boolean hasBalcony() {
        return balcony;
    }

    void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    double getSize() {
        return size;
    }

    void setSize(double size) {
        this.size = size;
    }

    double getRooms() {
        return rooms;
    }

    void setRooms(double rooms) {
        this.rooms = rooms;
    }

    Tenant getTenant() {
        return tenant;
    }

    void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    double getRent() {
        return rent;
    }

    void setRent(double rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                       "rent=" + rent +
                       ", tenant='" + tenant + '\'' +
                       ", rooms=" + rooms +
                       ", size=" + size +
                       ", balcony=" + balcony +
                       '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Apartment)) return false;

        Apartment apartment = (Apartment) o;

        return Double.compare(apartment.getRent(),getRent()) == 0 &&
               Double.compare(apartment.getRooms(),getRooms()) == 0 &&
               Double.compare(apartment.getSize(),getSize()) == 0 &&
               hasBalcony() == apartment.hasBalcony() &&
               (getTenant() != null ? getTenant().equals(apartment.getTenant()) : apartment.getTenant() == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getRent());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getTenant() != null ? getTenant().hashCode() : 0);
        temp = Double.doubleToLongBits(getRooms());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getSize());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (hasBalcony() ? 1 : 0);
        return result;
    }
}
