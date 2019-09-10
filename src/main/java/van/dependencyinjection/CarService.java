package van.dependencyinjection;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    private Car car;

    public CarService(Car car) {
        this.car = car;
    }

    public String howCar() {
        return car.getName();
    }
}
