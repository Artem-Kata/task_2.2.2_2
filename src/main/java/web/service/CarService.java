package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private static int carsCount;
    private List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car(++carsCount, "BMW", "X5"));
        carsList.add(new Car(++carsCount, "AUDI", "Q8"));
        carsList.add(new Car(++carsCount, "Infiniti", "FX37"));
        carsList.add(new Car(++carsCount, "Toyota", "Camry"));
        carsList.add(new Car(++carsCount, "Nissan", "RAV4"));
    }

    public List<Car> getCarsList(Integer count) {
        if (count == null || count >= 5) {
            return carsList;
        } else return carsList.subList(0, count);
    }
}