package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;
import org.launchcode.techjobs.oo.Job;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    Job job1;
    Job job2;
    Job job3;
    Job job4;
    Job job5;

    @Before
    @Test
    public void testSettingJobId(){
        job1 = new Job();
        job2 = new Job();

        //Use assertEquals, assertTrue, or assertFalse to test that the ID values for
        //the two objects are NOT the same and differ by 1.
        assertEquals(job1.getId(), job2.getId(), 1);
        assertTrue(job2.getId() -job1.getId() == 1);
        assertFalse(job2.getId() - job1.getId() != 1);

    }
    @Test
    public  void testJobConstructorSetsAllFields(){
        job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Use assert statements to test that the constructor correctly assigns the class and value of each field.
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(),"Desert");
        assertEquals(job3.getPositionType().getValue(),"Quality control");
        assertEquals(job3.getCoreCompetency().getValue(),"Persistence");

    }
    @Test
    public void testJobsForEquality(){
        job4 = new Job("Web developer", new Employer("XYZ"), new Location("Chicago"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job5 = new Job("Web Developer", new Employer("XYZ"), new Location("Chicago"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.getId() == job5.getId());
    }

}

