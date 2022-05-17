package Classes;

public class Vehicles {
    private String vehicle_number;
    private String color;
    private String owner_name;

    public String getVehicle_number() {
        return vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        this.vehicle_number = vehicle_number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    @Override
    public String toString() {return "VehicleNumber : " + getVehicle_number() + "\nColor : " + getColor() + "\nOwner's Name : " + getOwner_name();}
}
