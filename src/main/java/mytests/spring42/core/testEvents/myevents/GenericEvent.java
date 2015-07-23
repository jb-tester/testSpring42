package mytests.spring42.core.testEvents.myevents;

import org.springframework.core.ResolvableType;
import org.springframework.core.ResolvableTypeProvider;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
public class GenericEvent<T> {

    public GenericEvent() {
        System.out.println("generic event!!!!");
    }
}
