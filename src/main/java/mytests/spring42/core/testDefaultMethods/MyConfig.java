package mytests.spring42.core.testDefaultMethods;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Configuration
@ComponentScan
class MyConfig implements Service1, Service2 {

    @Override
    public Bean3 defBean3() {
        return new Bean3("defBean3 from impl");
    }
}
