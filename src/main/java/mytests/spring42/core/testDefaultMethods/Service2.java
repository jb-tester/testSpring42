package mytests.spring42.core.testDefaultMethods;

import org.springframework.context.annotation.Bean;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@SuppressWarnings("DefaultFileTemplate")
interface Service2 {
    @Bean
    default Bean2 defBean2(){
        return new Bean2("defBean1 from service2");
    }
    @Bean
    default Bean3 defBean3(){
        return new Bean3("defBean3 from Service1");
    }
}
