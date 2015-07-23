package mytests.spring42.core.testEvents.myevents;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
public class GenericBean1Event extends GenericEvent<Bean1> {
    public GenericBean1Event() {
        super();
        System.out.println("genericBean1Event published");
    }
}
