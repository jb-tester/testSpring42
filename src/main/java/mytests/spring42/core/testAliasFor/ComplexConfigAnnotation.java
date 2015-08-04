package mytests.spring42.core.testAliasFor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 8/4/2015.
 * Project: testSpring42
 * *******************************
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@ComponentScan
@ImportResource
@Configuration
public @interface ComplexConfigAnnotation {
    @AliasFor(annotation = ComponentScan.class, attribute = "basePackages")
    String[] scannedPackages() default {};
    @AliasFor(annotation = ImportResource.class, attribute = "locations")
    String[] xmlConfigFiles() default {};
    String value() default "mainConfig";
}
