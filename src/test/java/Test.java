import com.kuhn.spring.component.PersonController;
import com.kuhn.spring.config.MianConfig;
import com.kuhn.spring.dto.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10331 on 2019/4/20.
 */
public class Test {
    @org.junit.Test
    public void textconfig(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MianConfig.class);
//       PersonController personController= (PersonController) annotationConfigApplicationContext.getBean(PersonController.class);
       // PersonController personController2= (PersonController) annotationConfigApplicationContext.getBean(PersonController.class);
        String[] ss=annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String  s:ss){
            System.out.println(s);
        }
        //System.out.println(personController.equals(personController2));

    }
}
