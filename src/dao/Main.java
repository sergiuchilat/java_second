package dao;

import dao.model.Student;
import dao.service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        if(service.create(new Student("Ion Creanga", 123)) != null) {
            System.out.println("Create success");
        } else {
            System.out.println("Create error");
        }


        int id = 2;
        Student student = service.read(id);
        if(student.getId() != null){
            System.out.println("Student with id [" + id + "]: " + student);
        } else {
            System.out.println("Student with id [" + id + "] not found");
        }


        if(service.create(new Student("Mihai Eminescu", 120)) != null) {
            System.out.println("Create success");
        } else {
            System.out.println("Create error");
        }

        student = service.read(id);
        if(student.getId() != null){
            System.out.println("Student with id [" + id + "]: " + student);
        } else {
            System.out.println("Student with id [" + id + "] not found");
        }

        System.out.println("Students list: ");
        Student[] students = service.read();
        for (Student studentItem: students){
            if(studentItem != null) {
                System.out.println(studentItem.toString());
            }
        }

        if(service.update(2, new Student("Vasile Alexandri", 100)) != null) {
            System.out.println("Student with id [" + id + "] updated");
        } else {
            System.out.println("Student with id [" + id + "] not found");
        }

        System.out.println("Students list: ");
        students = service.read();
        for (Student studentItem: students){
            if(studentItem != null) {
                System.out.println(studentItem.toString());
            }
        }

        if(service.delete(2)) {
            System.out.println("Student with id [" + id + "] deleted");
        } else {
            System.out.println("Student with id [" + id + "] not found");
        }

        System.out.println("Students list: ");
        students = service.read();
        for (Student studentItem: students){
            if(studentItem != null) {
                System.out.println(studentItem.toString());
            }
        }
    }
}