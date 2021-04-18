package lab1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractCourse> courses = new ArrayList<>();
        courses.add(new IntroJavaCourse("Introduction to Java", "J100"));
        courses.add(new IntroToProgrammingCourse("Intro to Prog with Go", "P101"));
        courses.add(new AdvancedJavaCourse("Advanced Java with Algorithms", "AJ200"));

        for (AbstractCourse c: courses){
            System.out.println(c.getCourseNumber());
        }

    }
}
