package Car_plant;

import java.util.ArrayList;

public class CarArray {
    private ArrayList<Car> carArray = new ArrayList<>();

    public void add(Car car) {
        carArray.add(car);
    }

    //Метод, который возвращает массив автомобилей, отсортированный по году производства
    public Car[] sortCars(Car[] cars) {
        for (int j = 0; j < cars.length; j++) {
            for (int i = 0; i < cars.length - 1 - j; i++) {
                if (cars[i].getProductionYear() > cars[i + 1].getProductionYear()){
                    Car temp = cars[i];
                    cars[i] = cars[i + 1];
                    cars[i + 1] = temp;
                }
            }
        }
        return cars;
    }

    //Метод, который возвращает массив автомобилей заданного цвета
    public Car[] getCarsByColor(String color, Car[] cars) {
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getColor() == color){
                counter++;
            }
        }

        Car[] carsByColor = new Car[counter];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getColor() == color){
                counter--;
                carsByColor[counter] = cars[i];
            }
        }
        return carsByColor;
    }
}
