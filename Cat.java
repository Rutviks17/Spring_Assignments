package Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String cat_name;
    private String owner_name;
    private String breed_name;
    @Autowired(required = false)
    private Color color;

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
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

    public void catDisplay()
    {
        System.out.println(" Cat Details \nCat Name : "+getCat_name()+"\nBreed Name : "+getBreed_name()+
                "\nOwner's Name : "+getOwner_name()+"\nColor\n"+getColor());
    }
}
