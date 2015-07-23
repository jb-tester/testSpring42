package mytests.spring42.core.testEvents.myevents;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
public class GenericBean2Event extends GenericEvent<Bean2> {
    public GenericBean2Event() {

        super();
        System.out.println("genericBean2Event published");
    }
}
