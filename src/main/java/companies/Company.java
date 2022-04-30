package companies;

import employee.Employee;
import tasks.ArchitecturalTask;
import tasks.EngineeringTask;
import tasks.SoftwareTask;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {
    //Liskov substitution principle (more detail tomorrow, part of SOLID lesson)
    //you can handle a subtype as a supertype wihout issues
    //So when you use inheritance, you should always be sure that we dont break the supertype

    //declared the existence of a list
    List<Employee> employees;

    //declared and initialised
    protected LinkedList<SoftwareTask> softwareBacklog =new LinkedList<>();
    protected LinkedList<ArchitecturalTask> archBacklog= new LinkedList<>();
    protected LinkedList<EngineeringTask> engineeringBacklog= new LinkedList<>();

    //constructor-
    public Company() {
        //initialising list- populating it with an array list- ready to accept object into it

        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
        //now can add employees to our company
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    //providing getters to access protected lists

    public LinkedList<SoftwareTask> getSoftwareBacklog() {
        return softwareBacklog;
    }

    public LinkedList<ArchitecturalTask> getArchBacklog() {
        return archBacklog;
    }

    public LinkedList<EngineeringTask> getEngineeringBacklog() {
        return engineeringBacklog;
    }
}
