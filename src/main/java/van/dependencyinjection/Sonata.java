package van.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Sonata implements Car {
    private final String name = "Sonata";

    @Override
    public String getName() {
        return name;
    }
}
