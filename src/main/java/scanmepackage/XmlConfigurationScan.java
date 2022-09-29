package scanmepackage;

import XmlBeans.Address;
import XmlBeans.Person;
import XmlBeans.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * For use in JavaConfig where no XML configuration is required.
 */
@Configuration
public class XmlConfigurationScan {

    @PostConstruct()
    public void init(){System.out.println("custom init method called");}
    @PreDestroy()
    public void destroy(){System.out.println("custom destroy method called");}

    @Bean()
    public Address getAddress(){
        return new Address("XmlConfigScan","Xml","USA","12344");
    }

    @Bean("homePh")
    @Order(1)
    public Phone getHomePhone(){ return new Phone("0000000");}

    @Bean("businessPh")
    @Order(0)
    public Phone getBusiness(){return new Phone("111111");}

    @Bean()
    @Autowired
    public Person getPerson(List<Phone> phoneList, Address address){
        return new Person(11,"John Doe",address,phoneList);
    }
}
