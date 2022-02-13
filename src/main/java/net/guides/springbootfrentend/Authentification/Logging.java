package net.guides.springbootfrentend.Authentification;

import net.guides.springbootfrentend.Model.Employee;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Logging {
    public String log(Employee e){
        return "employee: "+e.getFirstName()+", "+e.getLastName();
    }
}
