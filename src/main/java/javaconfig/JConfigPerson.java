package javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JConfigPerson
{

    private int id;
    private String name;
    private List<JConfigPhone> ph;
    @Autowired
    private JConfigAddress add;

    public JConfigPerson(int id, String name, JConfigAddress add, List<JConfigPhone> phone)
    {
        this.id = id;
        this.name = name;
        this.add = add;
        this.ph = phone;
    }

    public void setName(String name){this.name=name;}
    public void setAddress(JConfigAddress address){this.add = address;}
    public void setPhoneList(List<JConfigPhone> phoneList) {this.ph = phoneList;}

    public String getName() {return name;}
    public List<JConfigPhone> getPhones(){return this.ph;}
    public JConfigAddress getAdd(){return this.add;}

}
