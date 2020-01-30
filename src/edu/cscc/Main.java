package edu.cscc;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner input = new Scanner(System.in);
    // Gaige Wycuff, Killoran, Todo list program;

    public static void main(String[] args) {
        String item;
        int rm;
        int update;
        ArrayList<String> todo = new ArrayList<String>();

        while (true) {
            System.out.println("Please Choose an option: ");
            System.out.println("(1) Add a task.");
            System.out.println("(2) Remove a task.");
            System.out.println("(3) Update a task.");
            System.out.println("(4) List all tasks.");
            System.out.println("(0) Exit.");

            String option = input.nextLine();

            if (option.equals("1")) {
                String[] iem = addTask();
                String task = iem[0] + " - " + iem[1];
                todo.add(task);
            }
            if (option.equals("2")) {
                rm = removeTask();
                todo.remove(rm);
            }
            if (option.equals("3")) {
                String[] upDate = updateTask();
                int upValue = Integer.parseInt(upDate[0]);
                upDate[1] = upDate[1] + " - " + upDate[2];
                todo.set(upValue, upDate[1]);
            }
            if (option.equals("4")) {
                System.out.println("--------------------------------");
                for (int i = 0; i < todo.size(); i++) {
                    System.out.println(todo.get(i));
                }
                System.out.println("--------------------------------");
            }
            if (option.equals("0")) {
                break;
            }

        }
    }
    public static String[] addTask() {
        System.out.println("What do you want to add?");
        String task = input.nextLine();
        System.out.println("Please enter a description: ");
        String desc = input.nextLine();
        return new String[]{task, desc};
    }
    public static int removeTask() {
        System.out.println("What do you want to remove?");
        int rm = input.nextInt();
        input.nextLine();
        return rm;
    }
    public static String[] updateTask() {
        System.out.println("What would you like to update? ");
        String updateIndex = input.nextLine();
        System.out.println("What would you like the name to be? ");
        String updateTask = input.nextLine();
        System.out.println("Please enter a description: ");
        String desc = input.nextLine();

        return new String[]{updateIndex, updateTask, desc};
    }
}
