package mytests.spring42.core.testAliasFor;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Configuration
public @interface MyConfig {
    @AliasFor(annotation = Configuration.class, attribute = "value")
    String name();
}
