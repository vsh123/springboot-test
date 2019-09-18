package van.api;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorTest {

    @Test
    void Elevator() {
        Gson gson = new Gson();
        String body = "\n" +
                "{\n" +
                "  \"id\": 0,\n" +
                "  \"floor\": 1,\n" +
                "  \"passengers\": [{\n" +
                "  \"id\": 0,\n" +
                "  \"timestamp\": 0,\n" +
                "  \"start\": 1,\n" +
                "  \"end\": 2\n" +
                "},{\n" +
                "  \"id\": 0,\n" +
                "  \"timestamp\": 0,\n" +
                "  \"start\": 1,\n" +
                "  \"end\": 2\n" +
                "}],\n" +
                "  \"status\": \"STOPPED\"\n" +
                "}";
        Elevator command = gson.fromJson(body, Elevator.class);

        System.out.println(command);
    }
}