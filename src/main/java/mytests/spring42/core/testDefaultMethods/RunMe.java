package mytests.spring42.core.testDefaultMethods;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
public class RunMe {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        String[] beans = ctx.getBeanDefinitionNames();
        for (int i = 0; i < beans.length; i++) {
            String bean = beans[i];
            System.out.println(bean);
        }
        System.out.println("-------------------------------------");
        Comp1 comp1 = ctx.getBean(Comp1.class);
        comp1.displayAutowired();
    }

}
