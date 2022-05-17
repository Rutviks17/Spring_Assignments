package Test;

import Classes.Cat;
import Classes.Color;
import Classes.Config;
import Classes.Dog;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnimalTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Config.class);

        Cat c1= ctx.getBean(Cat.class);
        Color color = new Color();
        color.setBase_color("Black");
        color.setTexture_color("Black");
        c1.setCat_name("Maddy");
        c1.setBreed_name("Persian");
        c1.setOwner_name("Shashank");
        c1.setColor(color);
        c1.catDisplay();

        Dog d1=ctx.getBean(Dog.class);
        Color color1 = new Color();
        color1.setBase_color("White");
        color1.setTexture_color("White");
        d1.setDog_name("Tuffy");
        d1.setBreed_name("Indian Spitz");
        d1.setOwner_name("Shashank");
        d1.setColor(color1);
        d1.dogDisplay();
    }
}
