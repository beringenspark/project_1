package componentscan;

import org.springframework.stereotype.Component;

@Component
public class ScannedPhone
{
    private String mob;

    public ScannedPhone(){}

    public ScannedPhone(String mob)
    {
        this.mob = mob;
    }

    public String getMob() {
        return mob;
    }
}
