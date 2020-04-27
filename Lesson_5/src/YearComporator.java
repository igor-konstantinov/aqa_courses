import Car_plant.Car;

public class YearComporator {
    public class YearComparator implements  Comparator<car> {

        public int compare(Car car1, Car car2){
            if (car1.getProductionYear() == car2.getProductionYear()){
                return 0;
            } else if (car1.getProductionYear() > car2.getProductionYear()) {
                return 1;
            }
            else {
                return -1;
            }
        }
    }
}
