package mytests.spring42.core.testDefaultMethods;

import org.springframework.context.annotation.Bean;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */

public interface Service1 extends Service0 {
    @Bean
    default Bean1 defBean1(){
        return new Bean1("defBean1 from Service1");
    }
    @Bean
    default Bean3 defBean3(){
        return new Bean3("defBean3 from Service1");
    }
    @Bean
    default Bean4 defBean4(){
        return new Bean4("defBean4 from Service1");
    }


}
