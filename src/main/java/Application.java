import XmlBeans.Person;
import XmlBeans.Phone;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import jconfig.JConfigConfigurationScan;

@EnableAspectJAutoProxy
public class Application {

    public static void printPersonFromContext(Person p)
    {
        if(p != null && p.getAdd() != null && p.getPhones() != null)
        {
            System.out.println(" ------- Printing person -------");
            System.out.println(p.getName());
            System.out.println(p.getAdd().toString());
            p.aopTrigger("Trigger");
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
        AnnotationConfigApplicationContext javaconfigContext = new AnnotationConfigApplicationContext(JConfigConfigurationScan.class);

        Person classPathPerson = classpathContext.getBean(Person.class);
        Person xmlScannedPerson  = classPathXmlApplicationContextComponentScan.getBean(Person.class);
        Person jconfigScannedPerson = javaconfigContext.getBean(Person.class);

        printPersonFromContext(classPathPerson);
        printPersonFromContext(xmlScannedPerson);
        printPersonFromContext(jconfigScannedPerson);

    }
}
