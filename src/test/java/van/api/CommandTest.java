package van.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandTest {

    @Test
    void JsonTest() {
        Gson gson = new GsonBuilder().create();
        String body = "{\n" +
                "  \"elevator_id\": 0,\n" +
                "  \"command\": \"ENTER\"\n" +
//                "  \"call_ids\": [0]\n" +
                "}";
        gson.serializeNulls();
        Command command = gson.fromJson(body, Command.class);

        System.out.println(command);
    }

    @Test
    void name() {
        Gson gson = new Gson();

        String body = "{\n" +
                "  \"commands\": [\n" +
                "    {\n" +
                "      \"elevator_id\": 0,\n" +
                "      \"command\": \"ENTER\",\n" +
                "      \"call_ids\": [0]\n" +
                "    },\n" +
                "    {\n" +
                "      \"elevator_id\": 1,\n" +
                "      \"command\": \"STOP\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
        Command command = gson.fromJson(body, Command.class);

        System.out.println(command);
    }
}