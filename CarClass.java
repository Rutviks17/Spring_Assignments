package Classes;

public class CarClass {
    private String company;
    private String model;
    private Vehicles vehicles;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vehicles getVehicles() {
        return vehicles;
    }

    public void setVehicle(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public void display()
    {
        System.out.println(" Car Details \nCompany : "+getCompany()+"\nModel : "+getModel()+ "\n Vehicles Details\n"+getVehicles());
    }
}
