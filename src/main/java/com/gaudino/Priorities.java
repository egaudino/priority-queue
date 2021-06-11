package com.gaudino;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {

    private static final String SEPARATOR = " ";
    private static final String ENTER_EVENT = "ENTER";
    private static final String EMPTY_LIST = "EMPTY";

    private PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();

    List<Student> getStudents(List<String> events) {

        List<Student> studentList = new ArrayList<>();

        events.forEach(event -> {

            if (event.startsWith(ENTER_EVENT)) {
                String[] preparedString = event.split(SEPARATOR);
                priorityQueue.add(new Student(
                        Integer.parseInt(preparedString[3]),
                        preparedString[1],
                        Double.parseDouble(preparedString[2])));
            } else {
                priorityQueue.poll();
            }

        });

        if (priorityQueue.isEmpty()) {
            System.out.println(EMPTY_LIST);
        }

        while (!priorityQueue.isEmpty()) {
            studentList.add(priorityQueue.poll());
        }

        return studentList;
    }


}
