package testfileword;

import DataClass.Student;
import DataStructure.MyArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class WriteFile {

    private MyArrayList<Student> list20 = new MyArrayList<>();
    private MyArrayList<Student> list150 = new MyArrayList<>();
    private MyArrayList<Student> list1000 = new MyArrayList<>();
    private MyArrayList<Student> list10000 = new MyArrayList<>();
    private MyArrayList<Student> list100000 = new MyArrayList<>();
    private MyArrayList<Student> list1000000 = new MyArrayList<>();

    public WriteFile() {
    }

    public void start() {
        addStudent20();
        addStudent150();
        addStudent1000();
//        addStudent10000();
//        addStudent100000();
addStudent1000000();
        writeToFile(list20, "Student20.txt");
        writeToFile(list150, "Student150.txt");
        writeToFile(list1000, "Student1000.txt");
//        writeToFile(list10000, "Student10000.txt");
//         writeToFile(list100000, "Student100000.txt");
writeToFile(list1000000, "Student1000000.txt");

    }

    public void addStudent150() {
        String firstName;
        String lastName;
        String studentID;
        String ic;
        String password;
        double cgpa;

        for (int i = 0; i < 50; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(19, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list150.add(s);
        }

        for (int i = 0; i < 50; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(2));
            studentID = Long.toString(getStudentID(18, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list150.add(s);
        }

        for (int i = 0; i < 50; i++) {
            firstName = randomName(3);
            lastName = randomName(3);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(18, i + 500));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list150.add(s);
        }

    }
    
    public void addStudent20() {
        String firstName;
        String lastName;
        String studentID;
        String ic;
        String password;
        double cgpa;

        for (int i = 0; i < 20; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(19, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list20.add(s);
        }
    }

    public void addStudent1000() {
        String firstName;
        String lastName;
        String studentID;
        String ic;
        String password;
        double cgpa;

        for (int i = 0; i < 1000; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(19, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list1000.add(s);
        }
    }

    public void addStudent10000() {
        String firstName;
        String lastName;
        String studentID;
        String ic;
        String password;
        double cgpa;

        for (int i = 0; i < 10000; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(19, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list10000.add(s);
        }
    }

    public void addStudent100000() {
        String firstName;
        String lastName;
        String studentID;
        String ic;
        String password;
        double cgpa;

        for (int i = 0; i < 100000; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(19, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list100000.add(s);
        }
    }
    
    public void addStudent1000000() {
        String firstName;
        String lastName;
        String studentID;
        String ic;
        String password;
        double cgpa;

        for (int i = 0; i < 1000000; i++) {
            firstName = randomName(4);
            lastName = randomName(4);
            lastName += (" " + randomName(4));
            cgpa = Double.parseDouble(randomCgpa(3));
            studentID = Long.toString(getStudentID(19, i));
            ic = randomIC();
            password = ic;

            Student s = new Student(studentID, firstName, lastName, ic, cgpa, password);

            list1000000.add(s);
        }
    }

    private String randomName(int limit) {
        String str = "";
        String s;
        Random rnd = new Random();
        for (int i = 0; i < limit; i++) {
            if (i == 0) {
                str += (char) (rnd.nextInt(26) + 'A');
            } else {
                str += (char) (rnd.nextInt(26) + 'a');
            }

        }

        return str;
    }

    private String randomCgpa(int number) {
        String str = number + ".";
        Random rnd = new Random();
        for (int i = 0; i < 2; i++) {
            str += rnd.nextInt(10);
        }

        return str;
    }

    private long getStudentID(int number, int number2) {
        return number * 1000000 + number2;
    }

    private String randomIC() {
        String ic = "94052610";

        for (int i = 0; i < 4; i++) {
            ic += new Random().nextInt(10);
        }
        return ic;
    }

    public void writeToFile(MyArrayList<Student> list, String file) {
        try {
            FileWriter myWriter = new FileWriter(file);
            for (int i = 0; i < list.size(); i++) {
                myWriter.write(list.get(i).getStudentID() + ","
                        + list.get(i).getFirstName() + ","
                        + list.get(i).getLastName() + ","
                        + list.get(i).getIc() + ","
                        + list.get(i).getCgppa() + ","
                        + list.get(i).getPassword() + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
