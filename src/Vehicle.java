public class Vehicle {
    private String ManifacturersName;
    private int cylindersnumber;
    private ThePerson thePerson;

    public Vehicle(String manifacturersName, int cylindersnumber, ThePerson thePerson) {
        ManifacturersName = manifacturersName;
        this.cylindersnumber = cylindersnumber;
        this.thePerson = thePerson;
    }

    public String getManifacturersName() {
        return ManifacturersName;
    }

    public void setManifacturersName(String manifacturersName) {
        ManifacturersName = manifacturersName;
    }

    public int getCylindersnumber() {
        return cylindersnumber;
    }

    public void setCylindersnumber(int cylindersnumber) {
        this.cylindersnumber = cylindersnumber;
    }

    public ThePerson getThePerson() {
        return thePerson;
    }

    public void setThePerson(ThePerson thePerson) {
        this.thePerson = thePerson;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ManifacturersName='" + ManifacturersName + '\'' +
                ", cylindersnumber=" + cylindersnumber +
                ", thePerson=" + thePerson +
                '}';
    }
}

