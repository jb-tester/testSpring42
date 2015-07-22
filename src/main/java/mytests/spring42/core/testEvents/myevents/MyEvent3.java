package mytests.spring42.core.testEvents.myevents;

import org.springframework.context.ApplicationEvent;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
public class MyEvent3 extends ApplicationEvent {


    private final int num;

    public MyEvent3(Object source, int arg) {
        super(source);
        this.num = arg;
    }

    public int getNum() {
        return num;
    }
}
