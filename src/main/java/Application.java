import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Person classPathPerson = classpathContext.getBean(Person.class);
        Person appContextPerson = annotationConfigApplicationContext.getBean(Person.class);
        printPersonFromContext(classPathPerson);
        printPersonFromContext(appContextPerson);
    }


}
