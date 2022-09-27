import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

public class BeansConfiguration {

    @Bean()
    public Address getAddress() { return new Address("Annotation-Ville","Java-Class","Intelli-J","101110101"); }

    @Bean()
    public List<Phone> getPhoneList()
    {
        Phone home = new Phone("111111111");
        Phone cell = new Phone("222222222");

        List<Phone> phoneList = new ArrayList<>();
        phoneList.add(home);
        phoneList.add(cell);
        return phoneList;
    }

    @Bean()
    public Person getPerson(List<Phone> phoneList, Address address)
    {
        Person p = new Person();
        p.setName("Name from annotation context!");
        p.setAddress(address);
        p.setPhoneList(phoneList);
        return p;
    }

    @PostConstruct()
    public void init() {System.out.println("Configuration Bean class constructed.");}
}
