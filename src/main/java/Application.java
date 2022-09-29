import XmlBeans.Person;
import XmlBeans.Phone;
import componentscan.ScannedPerson;
import javaconfig.JConfigConfigurations;
import javaconfig.JConfigPerson;
import javaconfig.JConfigPhone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan(basePackages = {"componentscan"})
@Configuration
public class Application {

    public static void printPersonFromContext(Person p)
    {
        if(p != null && p.getAdd() != null && p.getPhones() != null)
        {
            System.out.println(" ------- Printing person -------");
            System.out.println(p.getName());
            System.out.println(p.getAdd().toString());
            for(Phone doePhone: p.getPhones())
                System.out.println(doePhone.getMob());
        }
        else
            System.out.println("The person bean is null or is misconfigured. Cannot print");
    }
    public static void main(String [] args)
    {
        ClassPathXmlApplicationContext classpathContext = new ClassPathXmlApplicationContext("beans.xml");
        ClassPathXmlApplicationContext classPathXmlApplicationContextComponentScan = new ClassPathXmlApplicationContext("scannedFile.xml");
        AnnotationConfigApplicationContext javaconfigContext = new AnnotationConfigApplicationContext(JConfigConfigurations.class);

        JConfigPerson person2 = javaconfigContext.getBean(JConfigPerson.class);
        Person classPathPerson = classpathContext.getBean(Person.class);
        ScannedPerson person  = classPathXmlApplicationContextComponentScan.getBean(ScannedPerson.class);
        printPersonFromContext(classPathPerson);
        System.out.println("Closing context...");
        classpathContext.close();

        for(JConfigPhone personIter:person2.getPhones()){
            System.out.println("*****");
            System.out.println(personIter.getMob());
        }
    }
}
