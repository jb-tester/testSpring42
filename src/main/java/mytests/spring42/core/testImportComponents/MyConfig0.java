package mytests.spring42.core.testImportComponents;

import mytests.spring42.core.testImportComponents.importedComponents.ImportedComp1;
import mytests.spring42.core.testImportComponents.importedComponents.ImportedComp2;
import mytests.spring42.core.testImportComponents.importedComponents.ImportedComp3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Configuration
@ComponentScan(basePackages = "mytests.spring42.core.testImportComponents.scannedComponents")
@Import(value = {ImportedComp1.class, ImportedComp2.class, ImportedComp3.class,ImportedConfig1.class})
public class MyConfig0 {

@Bean
public B2 b2(){
    return new B2("b2");
}
}
