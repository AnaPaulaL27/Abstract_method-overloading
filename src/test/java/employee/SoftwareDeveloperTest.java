package employee;

import companies.Company;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.SoftwareTask;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SoftwareDeveloperTest {
    //type of class under test in private
    private SoftwareDeveloper sd;

    @BeforeEach
    public void setUp() {
        Company company = new Company();

        sd = new SoftwareDeveloper("Jane Morris", 154324324,
                95000, company);


        // add tasks

        company.getSoftwareBacklog().add(new SoftwareTask("Write an " +
                "alternate version of Google."));

        company.getSoftwareBacklog().add(new SoftwareTask("Refactor an old class"));

        company.getSoftwareBacklog().add(new SoftwareTask("Write a debug module"));

    }

    @Test

    public void canPullTasks(){
        //SoftwareTask task = this.sd.employer.getSoftwareBacklog().pop();
        sd.work();
        sd.work();
        assertThat(sd.employer.getSoftwareBacklog().size()).isEqualTo(1);
}



}
