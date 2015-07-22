package mytests.spring42.core.testDefaultMethods;

import org.springframework.context.annotation.Bean;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
public interface Service0 {
    @Bean
    default Bean5 defBean5(){
        return new Bean5("defBean5 from Service0");
    }
}
