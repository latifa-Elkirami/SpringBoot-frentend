package net.guides.springbootfrentend.Controller;

import net.guides.springbootfrentend.Metier.EmployeeService;
import net.guides.springbootfrentend.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/")
public class employeeControler {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> Employees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("employees")
     public Employee CreateEmployee(@RequestBody Employee employee){
        System.out.println("Employee"+employee.toString());
        return  employeeService.createEmployees(employee);
    }

    @GetMapping(value = "employees/{id}")
    public ResponseEntity<Employee>  getEmployee(@PathVariable("id") Long id) {
        return ResponseEntity.ok(employeeService.getEmployee(id));
    }
    @PutMapping(value = "employees/{id}")
    public ResponseEntity<Employee>  updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employeeDetail) {
        Employee employee= employeeService.getEmployee(id);
        employee.setFirstName(employeeDetail.getFirstName());
        employee.setLastName(employeeDetail.getLastName());
        employee.setIdEmail(employeeDetail.getIdEmail());
        Employee employeeUpdater = employeeService.createEmployees(employee);
        return ResponseEntity.ok(employeeUpdater);
    }

    @DeleteMapping(value = "employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
        Employee employee =employeeService.getEmployee(id);
        employeeService.deleteEmployee(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}

