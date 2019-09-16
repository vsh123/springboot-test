package van.readyml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class VanYamlReadTest {
    @Autowired
    private VanYamlRead vanYamlRead;

    @Test
    void name() {
        String age = vanYamlRead.getAge();

        System.out.println("My age is " + age);
        assertThat(age).isEqualTo("300");
    }
}