package mytests.spring42.core.testEvents.myevents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
public class Bean1 {


    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
