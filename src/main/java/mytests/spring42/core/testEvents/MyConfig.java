package mytests.spring42.core.testEvents;

import mytests.spring42.core.testEvents.myevents.Bean1;
import mytests.spring42.core.testEvents.myevents.Bean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Configuration
@ComponentScan()
public class MyConfig {
    @Bean
    Bean1 b1(){
        Bean1 b1 = new Bean1();
        b1.setId("b1");
        return b1;
    }
    @Bean
    Bean2 b2(){
        Bean2 b2 = new Bean2();
        b2.setId("b2");
        return b2;
    }
}
