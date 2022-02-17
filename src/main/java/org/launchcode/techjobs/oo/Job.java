package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        this.id = nextId;
        nextId++;
    }

    public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
        this();
        this.name = aName;
        this.employer = aEmployer;
        this.location = aLocation;
        this.positionType = aPositionType;
        this.coreCompetency = aCoreCompetency;

    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name)&&
                Objects.equals(employer, job.employer)&&
                Objects.equals(location, job.location)&&
                Objects.equals(positionType, job.positionType)&&
                Objects.equals(coreCompetency, job.coreCompetency);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

//toString methods:
    public static String toString(Job jobValues) {

        if (jobValues.getName() == null && jobValues.getEmployer() == null && jobValues.getLocation() == null &&
                jobValues.getPositionType() == null && jobValues.getCoreCompetency() == null) {
            return "OOPS! This job does not seem to exist";

        }


        int jobValuesId = jobValues.getId();
        String jobValuesName = jobValues.getName();
        String jobValuesEmployer = jobValues.getEmployer().toString();
        String jobValuesLocation = jobValues.getLocation().toString();
        String jobValuesPositionType = jobValues.getPositionType().toString();
        String jobValuesCoreCompetency = jobValues.getCoreCompetency().toString();

        if(jobValuesName == null){
            jobValuesName = "Data not available!";
        }if(jobValuesEmployer == null){
            jobValuesEmployer = "Data not available!";
        }if(jobValuesLocation == null){
            jobValuesLocation = "Data not available!";
        }if(jobValuesPositionType == null){
            jobValuesPositionType = "Data not available!";
        }if(jobValuesCoreCompetency == null){
            jobValuesCoreCompetency = "Data not available!";
        }

        if(jobValuesName == ""){
            jobValuesName = "Data not available!";
        }if(jobValuesEmployer == "") {
            jobValuesEmployer = "Data not available!";
        }if(jobValuesLocation == "") {
            jobValuesLocation = "Data not available!";
        }if(jobValuesPositionType == "") {
            jobValuesPositionType = "Data not available!";
        }if(jobValuesCoreCompetency == "") {
            jobValuesCoreCompetency = "Data not available!";
        }
        return ("\n ID: " + jobValuesId + "\n Name: " + jobValuesName + "\n Employer: " + jobValuesEmployer +
                "\n Location: " + jobValuesLocation + "\n Position Type: " + jobValuesPositionType +
                "\n Core Competency: " + jobValuesCoreCompetency + "\n ");

    }
}



