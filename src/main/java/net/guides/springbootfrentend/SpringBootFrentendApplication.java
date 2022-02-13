package net.guides.springbootfrentend;

import net.guides.springbootfrentend.Authentification.Logging;
import net.guides.springbootfrentend.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringBootFrentendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootFrentendApplication.class, args);
    }
    //@Bean
    public Logging getLogin(){
        return new Logging();
    }
    @Bean
    public Employee getEmployee(){
        return new Employee();
    }
@Autowired
    ApplicationContext context;
    @Override
    public void run(String... args) throws Exception {
     Employee e =context.getBean(Employee.class);
    }
}
