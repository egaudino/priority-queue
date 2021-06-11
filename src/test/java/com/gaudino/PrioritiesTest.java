package com.gaudino;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class PrioritiesTest {

    Priorities priorities;

    @Before
    public void setup() {
        priorities = new Priorities();
    }

    @Test
    public void shouldReturnAllTheStudentByPriority() {

        String event1 = "ENTER John 3.75 50";
        String event2 = "ENTER Mark 3.8 24";
        String event3 = "ENTER Shafaet 3.7 35";

        var eventsList = asList(event1, event2, event3);

        var studentList = priorities.getStudents(eventsList);

        assertEquals("Mark", studentList.get(0).getName());
        assertEquals("John", studentList.get(1).getName());
        assertEquals("Shafaet", studentList.get(2).getName());

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }

    @Test
    public void shouldReturnAllTheStudentWithSameCGPA() {

        String event1 = "ENTER Ashley 3.9 42";
        String event2 = "ENTER Maria 3.6 46";
        String event3 = "ENTER Anik 3.95 49";
        String event4 = "ENTER Dan 3.95 50";
        String event5 = "SERVED";


        var eventsList = asList(event1, event2, event3, event4, event5);

        var studentList = priorities.getStudents(eventsList);

        assertEquals("Dan", studentList.get(0).getName());
        assertEquals("Ashley", studentList.get(1).getName());
        assertEquals("Maria", studentList.get(2).getName());

        for (Student student : studentList) {
            System.out.println(student.getName());
        }
    }

    @Test
    public void shouldReturnAllTheStudentWithSameNameAndSameCGPA() {

        String event1 = "ENTER Ashley 3.95 42";
        String event2 = "ENTER Maria 3.95 46";
        String event3 = "ENTER Ashley 3.95 50";


        var eventsList = asList(event1, event2, event3);

        var studentList = priorities.getStudents(eventsList);

        assertEquals(42, studentList.get(0).getId());
        assertEquals(50, studentList.get(1).getId());
        assertEquals(46, studentList.get(2).getId());

        for (Student student : studentList) {
            System.out.printf("%s %d%n", student.getName(), student.getId());
        }
    }


}