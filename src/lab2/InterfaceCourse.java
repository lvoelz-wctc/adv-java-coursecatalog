package lab2;

public interface InterfaceCourse {
    //remember that intro doesn't have prereqs so we don't define it here
    //this is an interface so no need for properties

    String getCourseNumber();
    void setCourseNumber(String courseNumber);
    double getCredits();
    void setCredits(double credits);

}
