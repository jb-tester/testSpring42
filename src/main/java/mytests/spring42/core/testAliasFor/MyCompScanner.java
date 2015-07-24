package mytests.spring42.core.testAliasFor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@ComponentScan
public @interface MyCompScanner {
    @AliasFor(annotation = ComponentScan.class, attribute = "basePackages")
    String[] scannedPackages() default {};

}
