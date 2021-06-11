package com.gaudino;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        final Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        Priorities priorities = new Priorities();

        List<String> events = new ArrayList<>();

        for (int i=0; i < totalEvents; i++) {
            String event = in.nextLine();
            events.add(event);
        }

        for (Student student : priorities.getStudents(events)) {
            System.out.println(student.getName());
        }

    }

}
