package van.api;

import java.util.List;

public class Elevator {
    private int id;
    private int floor;
    private List<Call> passengers;
    private String status;

    @Override
    public String toString() {
        return "Elevator{" +
                "id=" + id +
                ", floor=" + floor +
                ", passengers=" + passengers +
                ", status='" + status + '\'' +
                '}';
    }
}
