package van.api;

import java.util.List;

public class ElevatorGame {
    private String token;
    private int timestamp;
    private List<Elevator> elevators;
    private boolean is_end;

    @Override
    public String toString() {
        return "ElevatorGame{" +
                "token='" + token + '\'' +
                ", timestamp=" + timestamp +
                ", elevators=" + elevators +
                ", is_end=" + is_end +
                '}';
    }
}
