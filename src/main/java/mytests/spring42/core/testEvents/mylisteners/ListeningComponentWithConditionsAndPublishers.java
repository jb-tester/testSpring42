package mytests.spring42.core.testEvents.mylisteners;

import mytests.spring42.core.testEvents.myevents.MyEvent1;
import mytests.spring42.core.testEvents.myevents.MyEvent2;
import mytests.spring42.core.testEvents.myevents.MyEvent3;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
@Component
public class ListeningComponentWithConditionsAndPublishers {

    @EventListener({MyEvent1.class, MyEvent2.class, MyEvent3.class})
    public void handleAllMyEvents() {
        System.out.println("+++++++++++++++++++++  one of my events occurred!!!! ++++++++++++++++++++++++++");
    }
    @EventListener(condition = "#ev1.myStr == 'test event2 invocation from event1 listener'" )
    public void handleConditionalInvocationOfMyEvent2(MyEvent2 ev1) {
        System.out.println("++++++++++++ myevent2 was published with specified argument +++++++++++++++++++++");
        System.out.println(ev1.getMyStr());
    }

    @EventListener(condition = "#root.event.str1 == 'aaa'" )
    public void handleConditionalInvocationOfMyEvent1(MyEvent1 ev1) {
        System.out.println("++++++++++++ myevent1 was published with specified argument +++++++++++++++++++++");
        System.out.println(ev1.getStr1());
    }

    @EventListener
    public MyEvent2 handleMyEvent1andInvokeMyEvent2(MyEvent1 ev1) {
        System.out.println("++++++++++++ myevent1 was published with specified argument +++++++++++++++++++++");
        System.out.println(ev1.getStr1());
        return new MyEvent2("test event2 invocation from event1 listener");
    }

}
