package org.practice.XmlBeans;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class Person
{

    protected int id;
    @Value("#{'John Doe from SpEL'}")
    protected String name;
    protected List<Phone> ph;
    protected Address add;

    public Person(){}
    public Person(int id, String name, Address add, List<Phone> phone){
        this.id = id;
        this.add = add;
        this.ph = phone;
    }

    public void setName(String name){this.name=name;}
    public void setAddress(Address address){this.add = address;}
    public void setPhoneList(List<Phone> phoneList) {this.ph = phoneList;}


    public String getName() {return name;}
    public List<Phone> getPhones(){return this.ph;}
    public Address getAdd(){return this.add;}

    /**
     * Used to trigger aspect weaving
     * @param arg the arg to console log from the aspect
     */
    public void crossCutConcernOne(String arg){System.out.println("Inside user supplied definition of method crossCutConcernOne");}
    public void crossCutConcernTwo(String arg){System.out.println("Inside user supplied definition of method def of crossCutConcernTwo");}
}
