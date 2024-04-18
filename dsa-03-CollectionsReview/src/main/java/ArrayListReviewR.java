
import java.util.*;

public class ArrayListReviewR {

    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        System.out.println("*****Iterate ArrayList with For Loop with get(index)");

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("******Iterator*****forward iteration");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("******Iterator*****backward iteration");

        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }

        System.out.println("******  for each loop *********");

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("******  forEach Method with Lambda *********");
        students.forEach(student -> System.out.println(student));

        System.out.println("****** Sorting Elements in List using COMPARATOR INTERFACE *********");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student-> System.out.println(student));

        System.out.println("by name implementation of comparator interface");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(student-> System.out.println(student));



    }

    // IMPLEMENTATIONS OF COMPARATOR
    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }
    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }


}
