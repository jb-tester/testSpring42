package mytests.spring42.core.testEvents;

import mytests.spring42.core.testEvents.myevents.MyEvent1;
import mytests.spring42.core.testEvents.myevents.MyEvent2;
import mytests.spring42.core.testEvents.myevents.MyEvent3;
import mytests.spring42.core.testEvents.mypublishers.Comp2;
import mytests.spring42.core.testEvents.mypublishers.Comp3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
public class RunMe {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (String bean : beans) {
            System.out.println(bean);
        }
        ctx.stop();
        ctx.start();
        Comp2 cmp2 = ctx.getBean(Comp2.class);
        Comp3 comp3 = ctx.getBean(Comp3.class);
        ctx.publishEvent(new MyEvent2("test pojo event invocation"));
        ctx.publishEvent(new MyEvent3(comp3,999));
        cmp2.publishMyEvent1();
        ctx.publishEvent("test String event passing");
    }
}
