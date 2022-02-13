package net.guides.springbootfrentend.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data @NoArgsConstructor @AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_Name")
    @Value("latifa")
    private String firstName;
    @Column(name="last_Name")
    private String lastName;
    @Column(name="email_id")
    private String idEmail;
}
