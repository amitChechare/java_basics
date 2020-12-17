package java8;

import beans.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Sorting {
    public static void main(String[] args) {
        System.out.println("============== Sorting ==============");
        sortJavaObjectList();
    }

    public static void sortJavaObjectList() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Jon", 22, 1001));
        studentList.add(new Student("Steve", 19, 1003));
        studentList.add(new Student("Kevin", 23, 1005));
        studentList.add(new Student("Ron", 20, 1010));
        studentList.add(new Student("Lucy", 18, 1111));
        studentList.add(new Student("Amit", 21, 1006));

        List<Student> ageWiseSortedList = studentList.stream()
                .sorted((Student s1, Student s2) -> s1.getAge() - s2.getAge())
                .collect(Collectors.toList());

        System.out.println("AgeWiseSortedList=> " + ageWiseSortedList);

        List<Student> NameWiseSortedList = studentList.stream()
                .sorted((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());

        System.out.println("NameWiseSortedList=> " + NameWiseSortedList);



    }

    public static void sortArray() {
        Integer[] i = {1, 4, 3, 2, 5, 55, 66, 7, 6, 11, 33, 99, 9, 33, 44, 22};
        List<Integer> list = Arrays.asList(i);

        System.out.println("==> " + list.stream().sorted().collect(Collectors.toList()));

        System.out.println("Asc. order Square " +
                list.stream()
                        .sorted((Integer I1, Integer I2) -> I1 - I2)
                        .collect(Collectors.toList()));

        System.out.println("Desc. order Square "
                + list.stream()
                .sorted((Integer I1, Integer I2) -> I2 - I1)
                .collect(Collectors.toList()));


    }
}
