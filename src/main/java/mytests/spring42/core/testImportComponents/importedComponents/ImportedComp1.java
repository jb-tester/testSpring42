package mytests.spring42.core.testImportComponents.importedComponents;

import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Component(value = "_importedComp1_")
public class ImportedComp1 {
    public String getStr(){
        return "importedComp1";
    }
}
