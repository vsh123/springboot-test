package van.api;

import com.google.gson.annotations.Expose;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Command {
    private int elevator_id;
    private String command;
    private List<Integer> call_ids;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Command command = (Command) o;
//        return elevator_id == command.elevator_id &&
//                Objects.equals(this.command, command.command) &&
//                Arrays.equals(call_ids, command.call_ids);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(elevator_id, command);
//        result = 31 * result + Arrays.hashCode(call_ids);
//        return result;
//    }
//

    @Override
    public String toString() {
        return "Command{" +
                "elevator_id=" + elevator_id +
                ", command='" + command + '\'' +
                ", call_ids=" + call_ids +
                '}';
    }
}
