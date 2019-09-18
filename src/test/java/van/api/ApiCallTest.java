package van.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;

@SpringBootTest
class ApiCallTest {
    @Autowired
    private ApiCall apiCall;

    @Test
    void name() {
        ElevatorGame game = apiCall.Call("/start/tester/0/2", HttpMethod.POST, ElevatorGame.class);

        System.out.println(game);
    }
}