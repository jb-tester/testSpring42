package mytests.spring42.core.testImportComponents.importedComponents;

import mytests.spring42.core.testImportComponents.B3;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */

public class ImportedComp2 {
    public String getStr(){
        return "importedComp2";
    }
    @Bean
    public B3 b3(){
        return new B3("b3");
    }
}
