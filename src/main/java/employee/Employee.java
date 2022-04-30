package employee;

import tasks.Task;
import companies.Company;

public abstract class Employee {
    private String name;
    private int employeeId;
    private int salary;
    protected Company employer;

   // protected LinkedList<Task> backlog; //protected so subclasses can see

    //constructor- a special method used to initialise objects
    Employee(String name, int employeeId, int salary, Company employer) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.setEmployer(employer);

        //que-- FIFO= first in first out
       //backlog = new LinkedList<>();
    }

    //add task method which takes a task

    //our employee class need a set employer

    public void setEmployer(Company company) {
        this.employer = company;

    }

    public void addTask(Task task){
        //adds it to the backlog
      //backlog.add(task);
    }

    public abstract Task work();
    //work method takes from backlog
        //abstract method cannot have a body
        // ...body would be a definition, but then it wouldn't be abstract anymore
    public abstract Task work(Task task);





}
