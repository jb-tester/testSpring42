package mytests.spring42.core.testDefaultMethods;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Configuration
@ComponentScan
public class MyConfig implements Service1, Service2 {

    @Override
    public Bean3 defBean3() {
        return new Bean3("defBean3 from impl");
    }

    @Override
    public Bean4 defBean4() {
        return Service2.super.defBean4();
    }

    // defBean5 should be found only after this method uncommenting; without @bean annotation - should be still not found
   /* @Override
      @Bean
    public Bean5 defBean5() {

        return new Bean5("bean5 from impl");
    }*/
}
