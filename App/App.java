package App;

import entities.Car;
import entities.Motocycle;
public class App {
    public static void main(String[] args) {
        Car golf = new Car();
        Motocycle moto = new Motocycle();
        golf.setChassi("1323");
        moto.setChassi("414141");
    }
}
