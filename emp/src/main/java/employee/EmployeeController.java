package employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping(path = "/create")
    public @ResponseBody String addnewuser(@RequestParam String fname
            , @RequestParam String lname){
        Employee em = new Employee();
        em.setFname(fname);
        em.setLname(lname);
        employeeRepository.save(em);
        return "saved"+em;
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Employee> getAllUsers() {
        // This returns a JSON or XML with the users
        return employeeRepository.findAll();
    }
}
