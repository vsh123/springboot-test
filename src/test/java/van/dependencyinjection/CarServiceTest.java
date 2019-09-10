package van.dependencyinjection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarServiceTest {

    @Autowired
    private CarService carService;

    @Test
    void howCar() {
        String carName = carService.howCar();

    }
}