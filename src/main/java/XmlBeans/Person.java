package XmlBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

public class Person
{

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Person(){}
    public Person(int id, String name, Address add, List<Phone> phone){
        this.id = id;
        this.name = name;
        this.add = add;
        this.ph = phone;
    }

    public void setName(String name){this.name=name;}
    public void setAddress(Address address){this.add = address;}
    public void setPhoneList(List<Phone> phoneList) {this.ph = phoneList;}

    public String getName() {return name;}
    public List<Phone> getPhones(){return this.ph;}
    public Address getAdd(){return this.add;}

}
