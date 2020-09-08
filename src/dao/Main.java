package dao;

import dao.model.Student;
import dao.service.StudentService;

import java.util.Scanner;

public class Main {
    StudentService service = new StudentService();
    public static void main(String[] args) {
        Main app = new Main();
        int option;
        do{
            option = app.selectOption();
            switch (option) {
                case 1 -> app.create();
                case 2 -> app.find();
                case 3 -> app.list();
                case 4 -> app.update();
                case 5 -> app.delete();
                default -> System.out.println("Invalid option selected");
            }
        }while (option != 0);
    }

    private int selectOption() {
        System.out.println("Select option:");
        System.out.println("1. Add student:");
        System.out.println("2. Find student:");
        System.out.println("3. List of students:");
        System.out.println("4. Update student:");
        System.out.println("5. Delete student:");
        System.out.println("0. Exit:");
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (Exception e) {
            return 0;
        }
    }

    private void create(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Student name:");
            String name = scanner.nextLine();
            System.out.println("Student age:");
            Integer age = scanner.nextInt();
            if(service.create(new Student(name, age)) != null) {
                System.out.println("Create success");
            } else {
                System.out.println("Create error");
            }
        } catch (Exception e){
            System.out.println("Error: Invalid input data");
        }
    }

    private void find(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student ID to find:");
        Integer id = scanner.nextInt();
        Student student = service.read(id);
        if(student.getId() != null){
            System.out.println("Student with id [" + id + "]: " + student);
        } else {
            System.out.println("Student with id [" + id + "] not found");
        }
    }

    private void list(){
        System.out.println("Students list: ");
        Student[] students = service.read();
        for (Student studentItem: students){
            if(studentItem != null) {
                System.out.println(studentItem.toString());
            }
        }
    }

    private void update(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Student ID to update:");
            Integer id = scanner.nextInt();
            //todo nu functioneaza corect daca nu se creeaza o instanta noua la scaner
            scanner = new Scanner(System.in);
            System.out.println("Student name:");
            String name = scanner.nextLine();
            System.out.println("Student age:");
            Integer age = scanner.nextInt();
            if(service.update(id, new Student(name, age)) != null) {
                System.out.println("Student with id [" + id + "] updated");
            } else {
                System.out.println("Student with id [" + id + "] not found");
            }
        } catch (Exception e){
            System.out.println("Error: Invalid input data");
        }
    }

    public void delete(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student ID to delete:");
        Integer id = scanner.nextInt();
        if(service.delete(id)) {
            System.out.println("Student with id [" + id + "] deleted");
        } else {
            System.out.println("Student with id [" + id + "] not found");
        }
    }
}