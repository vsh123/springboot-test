package van.readyml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ApplicationYamlReadTest {
    @Autowired
    private ApplicationYamlRead applicationYamlRead;

    @Test
    void yamlFileTest() {
        String name = applicationYamlRead.getName();

        assertThat(name).isEqualTo("van");
    }
}