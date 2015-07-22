package mytests.spring42.core.testEvents.myevents;

import org.springframework.context.ApplicationEvent;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
public class MyEvent1 extends ApplicationEvent {
    private final String str1;
    private final String str2;

    public MyEvent1(Object source, String str1, String str2) {
        super(source);
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {

        return str2;
    }
}
