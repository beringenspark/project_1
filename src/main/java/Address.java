public class Address
{
    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address(){}
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