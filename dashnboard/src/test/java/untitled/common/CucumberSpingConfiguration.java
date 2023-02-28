package untitled.common;


import untitled.DashnboardApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashnboardApplication.class })
public class CucumberSpingConfiguration {
    
}
