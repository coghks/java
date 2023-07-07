package fc.java.part3;


import fc.java.model.CarDTO;
import fc.java.model.CarUtilityy;

public class CarUtility {
    public static void main(String[] args) {
        //car정보를 출력하는 동작을 가지고 있는 utility클래스를 설계하세요.
        int carSn = 110;
        String carName = "bmw";
        int carPrice = 12312;
        String carOwner = "홍길동";
        int carYear = 2015;
        String carType = "G";

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        //carPrint(car);

        CarUtilityy carUtil = new CarUtilityy();
        carUtil.carPrint(car);
    }
}
