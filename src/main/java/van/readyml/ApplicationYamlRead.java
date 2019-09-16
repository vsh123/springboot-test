package van.readyml;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "van")
public class ApplicationYamlRead {
    private String name;

    public String getName() {
        return name;
    }

    //application.yml의 van.name을 set해준다.
    public void setName(String name) {
        this.name = name;
    }
}
