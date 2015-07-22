package mytests.spring42.core.testImportComponents.scannedComponents;

import mytests.spring42.core.testImportComponents.B1;
import mytests.spring42.core.testImportComponents.B2;
import mytests.spring42.core.testImportComponents.B3;
import mytests.spring42.core.testImportComponents.ImportedConfig1;
import mytests.spring42.core.testImportComponents.importedComponents.ImportedComp1;
import mytests.spring42.core.testImportComponents.importedComponents.ImportedComp2;
import mytests.spring42.core.testImportComponents.importedComponents.extraScannedPackage.ScannedComp2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Component
public class ScannedComp1 {
    @Autowired
    private B1 b1;
    @Autowired
    private B2 b2;
    @Autowired
    @Qualifier("_importedComp1_")
    ImportedComp1 myImportedComp1;

    @Autowired
    ImportedComp2 myImportedComp2;

    @Autowired
    ImportedConfig1 myImportedConfig1;

    @Autowired
    private B3 b3;

    @Qualifier("scannedComp2")
    @Autowired
    private ScannedComp2 comp2;


    public String getStr(){
        return "scannedComp1";
    }

    public void displayBeans(){
        System.out.println("--- ScannedComp1 autowired beans: ---");
        System.out.println(b1.getStr());
        System.out.println(b2.getStr());
        System.out.println(myImportedComp1.getStr());
        System.out.println(myImportedComp2.getStr());
        System.out.println(b3.getStr());
        System.out.println(comp2.getStr());
    }

}
