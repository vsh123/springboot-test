package van.api;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CallTest {

    @Test
    void name() {
        Gson gson = new Gson();
        String body = "{\n" +
                "  \"id\": 0,\n" +
                "  \"timestamp\": 0,\n" +
                "  \"start\": 1,\n" +
                "  \"end\": 2\n" +
                "}";
        Call call = gson.fromJson(body, Call.class);

        System.out.println(call);
    }
}