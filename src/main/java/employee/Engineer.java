package employee;

import companies.Company;
import tasks.Task;

public class Engineer extends Employee {


    //constructor

    public Engineer(String name, int employeeId, int salary, Company company) {
        super(name, employeeId, salary, company);

        //methods
    }
    @Override
    public Task work () {
       // return null;
        Task task = this.employer.getEngineeringBacklog().pop();
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

    @Override
    public Task work(Task task) {
        return null;
    }
}