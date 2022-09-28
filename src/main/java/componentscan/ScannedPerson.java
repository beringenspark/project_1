package componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ScannedPerson
{

    private int id;
    private String name;
    @Autowired
    private List<ScannedPhone> ph;
    @Autowired
    private ScannedAddress add;

    public ScannedPerson(){}
    public ScannedPerson(int id, String name, ScannedAddress add, List<ScannedPhone> phone){
        this.id = id;
        this.name = name;
        this.add = add;
        this.ph = phone;
    }

    public void setName(String name){this.name=name;}
    public void setAddress(ScannedAddress address){this.add = address;}
    public void setPhoneList(List<ScannedPhone> phoneList) {this.ph = phoneList;}

    public String getName() {return name;}
    public List<ScannedPhone> getPhones(){return this.ph;}
    public ScannedAddress getAdd(){return this.add;}

}
