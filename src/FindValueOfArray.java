import java.util.Scanner;

public class FindValueOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter student 's name: ");
        String name = input.nextLine();
        System.out.println(checkIndex(students,name));
    }

    public static String checkIndex(String[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(name)) {
                return "index of " + name + " is " + i;
            }
        }
            return name + "is not in students array";

    }
}
