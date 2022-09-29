package org.practice.XmlBeans;

public class Address
{
    protected String city;
    protected String state;
    protected String country;
    protected String zipcode;

    public Address(){}

    public void  initMethod()
    {
        System.out.println("Calling init method for org.practice.XmlBeans.ScannedAddress bean!");
    }

    public void destroyMethod(){
        System.out.println("Calling destroy method..");
    }
    public Address(String city, String state, String country, String zip)
    {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zip;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipcode(String zip)
    {
        this.zipcode = zip;
    }

    @Override
    public String toString(){return String.format("%s, %s, %s - %s",this.city,this.state,this.country, this.zipcode);}


}