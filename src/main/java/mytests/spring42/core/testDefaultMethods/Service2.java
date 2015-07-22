package mytests.spring42.core.testDefaultMethods;

/**
 * Created by irina on 7/22/2015.
 */
@SuppressWarnings("DefaultFileTemplate")
interface Service2 {
    default String defmethod1(String arg){
        return "defmethod1 from service2 with "+arg;
    }
    default String defmethod2(String arg){
        return "defmethod2 from Service1 with "+arg;
    }
}
