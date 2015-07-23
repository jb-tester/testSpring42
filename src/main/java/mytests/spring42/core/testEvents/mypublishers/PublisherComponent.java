package mytests.spring42.core.testEvents.mypublishers;

import mytests.spring42.core.testEvents.myevents.MyEvent1;
import mytests.spring42.core.testEvents.myevents.MyEvent2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Component
public class PublisherComponent {
    @Autowired
    private ApplicationEventPublisher publisher;

    public void publishMyEvent1(){
        MyEvent1 ev = new MyEvent1(this,"aaa","bbb");
        publisher.publishEvent(ev);
    }
    public void publishMyEvent2(){
        MyEvent2 ev = new MyEvent2("foo");
        publisher.publishEvent(ev);
    }
}
