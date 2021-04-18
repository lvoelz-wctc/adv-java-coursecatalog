package lab1;

public abstract class AbstractCourse {

    //remember that intro doesn't have prereqs so we don't define it here
    //don't need to make private because they're abstract
    String courseNumber;
    String courseName;
    double credits;

    public abstract String getCourseNumber();
    public abstract void setCourseNumber(String courseNumber);
    public abstract double getCredits();
    public abstract void setCredits(double credits);


}
