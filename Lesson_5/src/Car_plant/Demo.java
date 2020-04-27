package Car_plant;

public class Demo {
    public static void main(String[] args) {

        //Массив из 5 объектов - экземпляров класса автомобиль, 3 из которых красного цвета
        Car[] cars = new Car[] {
                new Car("Mazda", "black", 4.0, 2010),
                new Car("Hyundai", "red", 3.5, 2011),
                new Car("Bugatti", "red", 2.5, 2009),
                new Car("BMW", "white", 5.0, 2012),
                new Car("Alfa romeo", "red", 4.5, 2000),
        };
        
        //Вывод массива экземпляров класса автомобиль
        System.out.println("Изначальный массив автомобилей: \n");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }

        //Сортировка массива экземпляров класса автомобиль по году выпуска с помощью метода в объекте класса CarArray
        CarArray cars1 = new CarArray(cars);
        cars1.sortCars(cars);

        //Вывод массива экземпляров класса автомобиль, отсортированного по году выпуска
        System.out.println("Отсортированный массив по году выпуска: \n");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }

        cars = cars1.getCarsByColor("red", cars);

        //Вывод массива экземпляров класса автомобиль красного цвета
        System.out.println("Красные автомобили: \n");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}