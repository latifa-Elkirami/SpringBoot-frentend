package net.guides.springbootfrentend.Metier;

import net.guides.springbootfrentend.Authentification.Logging;
import net.guides.springbootfrentend.Exception.ResourceNotFoundException;
import net.guides.springbootfrentend.Model.Employee;
import net.guides.springbootfrentend.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    Logging logging;
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee createEmployees(Employee employee){
        return employeeRepository.save(employee);
    }
    public String authentifier(){
        Employee employee = employeeRepository.findById((long)1).get();
        return logging.log(employee);
    }
    public Employee getEmployee(Long id){

        Employee employee= employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee not found"));
        return employee;
    }

    public  void deleteEmployee(Employee employee){
        employeeRepository.delete(employee);
    }

}
