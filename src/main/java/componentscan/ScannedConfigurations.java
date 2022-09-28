package componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ScannedConfigurations {

    @Bean
    @Autowired
    public List<ScannedPhone> getPhoneList(ScannedPhone phone){
        List<ScannedPhone> addressList = new ArrayList<>();
        addressList.add(phone);
        return addressList;
    }
}
