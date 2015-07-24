package mytests.spring42.core.testAliasFor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
public class RunMe {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig0.class);
        for (String bean : ctx.getBeanDefinitionNames()) {
            System.out.println(bean);
        }
    }
}
