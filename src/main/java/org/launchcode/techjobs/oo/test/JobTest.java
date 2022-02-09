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
     Job jobTest1 = new Job();
     Job jobTest2 = new Job();
     Job jobTest3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     Job jobTest4 = new Job("Web developer", new Employer("XYZ"), new Location("Chicago"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     Job jobTest5 = new Job("Web Developer", new Employer("XYZ"), new Location("Chicago"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
     Job jobTest6 = new Job("gigi", new Employer("ABC"), new Location(), new PositionType("Lab analyst"), new CoreCompetency());
    //@Before

    @Test
    public void testSettingJobId(){
        //Use assertEquals, assertTrue, or assertFalse to test that the ID values for
        //the two objects are NOT the same and differ by 1.
        assertEquals(jobTest1.getId(), jobTest2.getId(), 1);
        assertTrue(jobTest2.getId() - jobTest1.getId() == 1);
        assertFalse(jobTest2.getId() - jobTest1.getId() != 1);

    }
    @Test
    public  void testJobConstructorSetsAllFields(){
        //job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        // Use assert statements to test that the constructor correctly assigns the class and value of each field.
        assertTrue(jobTest3.getEmployer() instanceof Employer);
        assertTrue(jobTest3.getLocation() instanceof Location);
        assertTrue(jobTest3.getPositionType() instanceof PositionType);
        assertTrue(jobTest3.getCoreCompetency() instanceof CoreCompetency);
       // assertEquals(job3.getId(), 8);
        assertEquals(jobTest3.getName(), "Product tester");
        assertEquals(jobTest3.getEmployer().getValue(), "ACME");
        assertEquals(jobTest3.getLocation().getValue(),"Desert");
        assertEquals(jobTest3.getPositionType().getValue(),"Quality control");
        assertEquals(jobTest3.getCoreCompetency().getValue(),"Persistence");

    }
    @Test
    public void testJobsForEquality(){
       assertFalse(jobTest4.getId() == jobTest5.getId());
        //assertFalse(job4.equals(job5));
    }

    //checks id code starts and ends with blank lines,
    // string that contains a blank line before and after the job information.
    @Test
    public void testToStringStartsAndEndWithNewLine(){
        String[] toStringTestJob = Job.toString(jobTest3).split("\n");
        assertTrue(toStringTestJob[0].isBlank());
        assertTrue(toStringTestJob[toStringTestJob.length - 1].isBlank());

    }

    @Test //checks for each field returns the label and value
    public void testToStringLabelReturned(){
        //Job jobTest4 = new Job("Web developer", new Employer("XYZ"), new Location("Chicago"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String toStringLabelValuedTestJob = Job.toString((jobTest4));
        assertTrue(toStringLabelValuedTestJob.contains("ID: 4"));
        assertTrue(toStringLabelValuedTestJob.contains("Name: Web developer"));
        assertTrue(toStringLabelValuedTestJob.contains("Employer: XYZ"));
        assertTrue(toStringLabelValuedTestJob.contains("Location: Chicago"));
        assertTrue(toStringLabelValuedTestJob.contains("Position Type: Quality control"));
        assertTrue(toStringLabelValuedTestJob.contains("Core Competency: Persistence"));

       // assertEquals("\nID: " + jobTest4.getId() + "\nName: Product tester\nEmployer: ACME\nLocation: " +
            //    "Desert\nPosition Type: Quality control\nCore Competency: Persistence\n" , jobTest4.toString());
    }
    @Test //returns "data not available message if a field is empty"
    public void testToStringHandlesEmptyField(){
        String toStringBlankFieldsResults = Job.toString(jobTest6);
        System.out.println(Job.toString(jobTest6));
        assertTrue(toStringBlankFieldsResults.contains("Data not available!"));

    }


}

