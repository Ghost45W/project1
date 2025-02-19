
//Project 1 - To do list - Noah Wright - 2/4/25
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> todolist = new ArrayList<>();


        int action = -1;
        while (action != 0) {
            System.out.println("(1) Add a task");
            System.out.println("(2) Remove a task");
            System.out.println("(3) Update a task");
            System.out.println("(4) List all tasks");
            System.out.println("(0) Exit");
            action = input.nextInt();
            input.nextLine();


            if (action == 1) {
                System.out.println("What is the task you would like to add?");
                todolist.add(input.nextLine());
            }
            if (action == 2) {
                for (String task : todolist) System.out.println(task);;
                System.out.println("Which task would you like to remove");
                todolist.remove(input.nextLine());

            }
            if (action == 3) {
                System.out.println("What is the task you would like to update?");
                todolist.remove(input.nextLine());
                System.out.println("What would you like it to now be?");
                todolist.add(input.nextLine());
            }
            if (action == 4) {
                for (String task : todolist) System.out.println(task);;
            }
            if (action == 0) {
                break;
            }
        }


    }
}