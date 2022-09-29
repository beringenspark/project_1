package org.practice;

import org.practice.XmlBeans.Address;
import org.practice.XmlBeans.Person;
import org.practice.XmlBeans.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

/**
 * For use in xmlScannedContext.
 */
@Configuration
@ComponentScan(basePackages = {"org.practice.aop"})
@EnableAspectJAutoProxy //enable org.practice.aop for this context config
public class JConfigConfigurationScan {

    @PostConstruct()
    public void init(){System.out.println("custom init method called");}
    @PreDestroy()
    public void destroy(){System.out.println("custom destroy method called");}

    @Bean()
    public Address getAddress(){
        return new Address("JConfigScan","Java","USA","44444");
    }

    @Bean("homePh")
    @Order(1)
    public Phone getHomePhone(){ return new Phone("9999999");}

    @Bean("businessPh")
    @Order(0)
    public Phone getBusiness(){return new Phone("7777777");}

    @Bean()
    @Autowired
    public Person getPerson(List<Phone> phoneList, Address address){
        return new Person(11,"Java Doe",address,phoneList);
    }
}
