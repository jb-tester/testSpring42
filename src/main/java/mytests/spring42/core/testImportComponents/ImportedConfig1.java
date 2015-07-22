package mytests.spring42.core.testImportComponents;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by irina on 7/22/2015.
 * project: testSpring42
 */
@Configuration
public class ImportedConfig1 {

    @Autowired
    private B3 b3;

    @Bean
    public B1 b1(){
        return new B1("b1 with "+b3.getStr());
    }
}
