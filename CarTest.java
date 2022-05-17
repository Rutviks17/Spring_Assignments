package Test;


import Classes.CarClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        CarClass c1=(CarClass)context.getBean("carbean");
        c1.display();
    }
}
