import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[1000];
        int cnt = 0;
        int choice;

        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENT");
            System.out.println("PRESS [0] TO EXIT");
            choice = in.nextInt();

            if (choice == 1) {
                String name = in.next();
                String surname = in.next();
                double gpa = in.nextDouble();

                students[cnt] = new Student(name, surname, gpa);
                cnt++;
            } else if (choice == 2) {
                for (int i = 0; i < cnt; i++)
                    System.out.println((i + 1) + ") " + students[i].getData());
                System.out.println();
            } else if (choice == 0) {
                break;
            }
        }
    }
}