package employee;

import companies.Company;
import tasks.Task;

public class SoftwareDeveloper extends Employee {


    //constructor

    public SoftwareDeveloper(String name, int employeeId, int salary, Company company) {
        super(name, employeeId, salary, company);

        //methods
    }

    //overloading
    @Override
    public Task work () {
        //return null;
        //accessing a communal backlog
        Task task = this.employer.getSoftwareBacklog().pop();
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;

    }

    @Override
    public Task work(Task task) {
        //return null;
        System.out.println(task.getDescription()); // do it
        task.setIsComplete(true);
        return task;
    }
}