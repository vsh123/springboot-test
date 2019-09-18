package van.api;

import java.util.Arrays;
import java.util.Objects;

public class Call {
    private int id;
    private int timestamp;
    private int start;
    private int end;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Call call = (Call) o;
        return id == call.id &&
                timestamp == call.timestamp &&
                start == call.start &&
                end == call.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, timestamp, start, end);
    }

    @Override
    public String toString() {
        return "Call{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", start=" + start +
                ", end=" + end +
                '}';
    }
}
