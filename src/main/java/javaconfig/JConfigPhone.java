package javaconfig;

import org.springframework.stereotype.Component;

@Component
public class JConfigPhone
{
    private String mob;

    public JConfigPhone(){}

    public JConfigPhone(String mob)
    {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }
}
