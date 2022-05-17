package Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String dog_name;
    private String owner_name;
    private String breed_name;
    @Autowired(required = false)
    private Color color;

    public String getDog_name() {
        return dog_name;
    }

    public void setDog_name(String dog_name) {
        this.dog_name = dog_name;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getBreed_name() {
        return breed_name;
    }

    public void setBreed_name(String breed_name) {
        this.breed_name = breed_name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void dogDisplay()
    {
        System.out.println("\n Dog Details \nDog Name : "+getDog_name()+"\nBreed Name : "+getBreed_name()+
                "\nOwner's Name : "+getOwner_name()+"\nColor\n"+getColor());
    }
}
