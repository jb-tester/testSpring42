package mytests.spring42.core.testEvents.mylisteners;

import mytests.spring42.core.testEvents.myevents.MyEvent1;
import mytests.spring42.core.testEvents.myevents.MyEvent2;
import mytests.spring42.core.testEvents.myevents.MyEvent3;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Component
public class ListeningComponent {
    @EventListener
    public void listenContextStoppedEvent(ContextStoppedEvent event){
        System.out.println("****************************");
        System.out.println(event.getClass().getCanonicalName());
        System.out.println("****************************");

    }
    @EventListener(ContextStartedEvent.class)
    public void listenContextStartedEvent(){
        System.out.println("****************************");
        System.out.println("ContextStartedEvent occurred");
        System.out.println("****************************");

    }

    @EventListener
    public void listenStrEvent(String arg){
        System.out.println("****************************");
        System.out.println("string was published: "+arg);
        System.out.println("****************************");
    }
    @EventListener
    public void listenMyEvent1(MyEvent1 event1){
        System.out.println("*************************");
        System.out.println(event1.getClass().getSimpleName()+": "+event1.getStr1()+" "+event1.getStr2());
        System.out.println("*************************");
    }

    @EventListener(MyEvent1.class)
    public void listenMyEvent1(){
        System.out.println("*************************");
        System.out.println("myEvent1");
        System.out.println("*************************");
    }

    @EventListener()
        public void listenMyEvent2(MyEvent2 event2){
        System.out.println("*************************");

        System.out.println("myEvent2 "+event2.getMyStr());
        System.out.println("*************************");
    }

    @EventListener(MyEvent2.class)
    public void listenMyEvent2(){
        System.out.println("*************************");

        System.out.println("myEvent2");
        System.out.println("*************************");
    }

    @EventListener
    public void listenMyEvent3(MyEvent3 event3){
        System.out.println("*************************");
        System.out.println("myEvent3 "+event3.getNum());
        System.out.println("*************************");
    }
    @EventListener(MyEvent3.class)
    public void listenMyEvent3(){
        System.out.println("*************************");
        System.out.println("myEvent3 ");
        System.out.println("*************************");
    }


}
