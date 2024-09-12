import jdk.jfr.BooleanFlag;

import java.util.Objects;

public class Truck extends Vehicle {
    private Double loadCapacity;
    private Double towingCapacity;

    public Truck(String manifacturersName, int cylindersnumber, ThePerson thePerson, Double loadCapacity, Double towingCapacity) {
        super(manifacturersName, cylindersnumber, thePerson);
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public Double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(Double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return Objects.equals(loadCapacity, truck.loadCapacity) && Objects.equals(towingCapacity, truck.towingCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadCapacity, towingCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", towingCapacity=" + towingCapacity +
                '}'+super.toString();
    }
}

