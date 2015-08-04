package mytests.spring42.core.testAliasFor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

/**
 * Created by irina on 7/23/2015.
 * project: testSpring42
 */
//@MyConfig(name = "foo")
//@MyCompScanner(scannedPackages = "mytests.spring42.core.testAliasFor.scannedComps")
@ComplexConfigAnnotation(scannedPackages = "mytests.spring42.core.testAliasFor.scannedComps", xmlConfigFiles = "aaa.xml")
public class MyConfig0 {

   // uses complex annotation that includes Configuration+ComponentScan+ImportResource
}
