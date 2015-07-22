package mytests.spring42.core.testDefaultMethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Component
public class Comp1 {

    @Autowired
    private Bean1 defBean1;

    @Autowired
    private Bean2 defBean2;

   @Qualifier("defBean3")
    @Autowired
    private Bean3 bean3;

    @Qualifier("defBean3")
    @Autowired
    private Bean3 defBean3;

    public Bean3 getBean3() {
        return bean3;
    }

    public Bean1 getDefBean1() {
        return defBean1;
    }

    public Bean2 getDefBean2() {
        return defBean2;
    }

    public Bean3 getDefBean3() {
        return defBean3;
    }

    public void displayAutowired(){
        getDefBean1();
        getDefBean2();
        getBean3();
        getDefBean3();

    }
}
