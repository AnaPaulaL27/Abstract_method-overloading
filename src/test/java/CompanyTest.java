import companies.Company;
import employee.Architect;
import employee.Engineer;
import employee.SoftwareDeveloper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CompanyTest {
    private Company company;

    @BeforeEach

    public void setUp() {
        company = new Company();
        //do some configuration for set up of eat test
        //upcasting- handle subtype as supertype

        //creating 3 employees, setup for every test:
        company.addEmployee(new Architect("John Doe",
                1234, 45000, company));

        company.addEmployee(new SoftwareDeveloper("Black Beard",
                19433, 90000, company));

        company.addEmployee(new Engineer("Jake Stevens",
                95732, 33000, company));
    }



    @Test
    //check employees being added properly

    public void addsEmployees(){
        assertThat(company.getEmployees().size()).isEqualTo(3);
        //we are getting 3 objects from our expression
        //assertThat(expression)
        //.isEqualTo(expected result);
    }
}
