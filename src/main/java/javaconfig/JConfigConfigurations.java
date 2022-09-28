package javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class JConfigConfigurations {

    @Bean
    @Autowired
    public List<JConfigPhone> getPhoneList(JConfigPhone phone){
        List<JConfigPhone> addressList = new ArrayList<>();
        addressList.add(phone);
        return addressList;
    }

    @Bean
    public JConfigPhone getPhone(){
        return new JConfigPhone("9999999");
    }

    @Bean
    public JConfigAddress getAddress(){
        JConfigAddress address = new JConfigAddress();
        address.setCity("Jakarta");
        address.setCountry("Indonesia");
        address.setZipcode("44444");
        address.setState("JK");
        return address;
    }

@Bean
@Autowired
public JConfigPerson getPerson(List<JConfigPhone> phone, JConfigAddress address){
        return new JConfigPerson(54,"JConfigName",address,phone);
    }
}