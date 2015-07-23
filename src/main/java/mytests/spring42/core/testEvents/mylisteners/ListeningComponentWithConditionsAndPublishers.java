package mytests.spring42.core.testEvents.mylisteners;

import mytests.spring42.core.testEvents.myevents.*;
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

    // inspection should show error for this method:
   /* @EventListener
    public void handleAllMyEventsAsParameters(MyEvent1 ev1, MyEvent2 ev2, MyEvent3 ev3) {
        System.out.println("+++++++++++++++++++++  listen all events: ++++++++++++++++++++++++++");

        if(ev1 != null){
            System.out.println("MyEvent1 occurred with arguments: "+ev1.getStr1()+", "+ ev1.getStr2());
        } else {if(ev2 != null){System.out.println("MyEvent2 occurred with arguments: "+ev2.getMyStr());} else System.out.println("MyEvent3 occurred with arguments: "+ev3.getNum());}
    }*/

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

    @EventListener
    public void listenGenericBean1Event(GenericEvent<Bean1> event){
        System.out.println("========= generic event for bean1 ========== ");
    }
}
