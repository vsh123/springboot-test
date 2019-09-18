package van.api;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElevatorGameTest {
    @Test
    void name() {
        Gson gson = new Gson();
        String body = "{\n" +
                "  \"token\": \"TVqpM5MX0amQqhrYKd3ZwMZn3Im6y4ovJwEa_A1-2d6mBpl4QhwJmmkrrvG4MsaD+mG44dL0aC0RNYL\",\n" +
                "  \"timestamp\": 0,\n" +
                "  \"elevators\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"floor\": 1,\n" +
                "      \"passengers\": [],\n" +
                "      \"status\": \"STOPPED\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": 1,\n" +
                "      \"floor\": 1,\n" +
                "      \"passengers\": [],\n" +
                "      \"status\": \"STOPPED\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"is_end\": false\n" +
                "}";

        ElevatorGame game = gson.fromJson(body, ElevatorGame.class);

        System.out.println(game);
    }
}