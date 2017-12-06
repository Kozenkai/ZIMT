package core;

import java.util.Date;

class Tenant {
    private String firstName;
    private String lastName;
    private Date rentalPeriod;
    private boolean overdue;

    Tenant(String firstName, String lastName, Date rentalPeriod, boolean overdue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rentalPeriod = rentalPeriod;
        this.overdue = overdue;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    Date getRentalPeriod() {
        return rentalPeriod;
    }

    void setRentalPeriod(Date rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
    }

    Boolean getOverdue() {
        return overdue;
    }

    void setOverdue(Boolean overdue) {
        this.overdue = overdue;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                       "firstName='" + firstName + '\'' +
                       ", lastName='" + lastName + '\'' +
                       ", rentalPeriod=" + rentalPeriod +
                       ", overdue=" + overdue +
                       '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tenant)) return false;

        Tenant tenant = (Tenant) o;

        return (getFirstName() != null ? getFirstName().equals(tenant.getFirstName()) : tenant.getFirstName() == null) &&
               (getLastName() != null ? getLastName().equals(tenant.getLastName()) : tenant.getLastName() == null) &&
               (getRentalPeriod() != null ? getRentalPeriod().equals(tenant.getRentalPeriod()) : tenant.getRentalPeriod() == null) &&
               (getOverdue() != null ? getOverdue().equals(tenant.getOverdue()) : tenant.getOverdue() == null);
    }

    @Override
    public int hashCode() {
        int result = getFirstName() != null ? getFirstName().hashCode() : 0;
        result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
        result = 31 * result + (getRentalPeriod() != null ? getRentalPeriod().hashCode() : 0);
        result = 31 * result + (getOverdue() != null ? getOverdue().hashCode() : 0);
        return result;
    }
}
