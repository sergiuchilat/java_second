package dao.dao;

import dao.model.Student;

public class StudentDAO {
    private final Student[] data;

    public StudentDAO() {
        this.data = new Student[50];
    }

    public Student create(Student student){
        student.setId(Student.counter);
        this.data[Student.counter - 1] = student;
        Student.counter++;
        return student;
    }

    public Student read(Integer id) {
        for (Student student : data) {
            try{
                if (student.getId().equals(id)) {
                    return student;
                }
            } catch (Exception e) {
                return empty();
            }

        }
        return empty();
    }

    public Student[] read() {
        return this.data;
    }

    public Student update(Integer id, Student studentToUpdate){
        for (int i = 0; i < data.length; i++) {
            try{
                if (data[i].getId().equals(id)) {
                    studentToUpdate.setId(id);
                    data[i] = studentToUpdate;
                    return data[i];
                }
            } catch (Exception e) {
                return empty();
            }
        }
        return empty();
    }

    public boolean delete(Integer id){
        for (int i = 0; i < data.length; i++) {
            try{
                if (data[i].getId().equals(id)) {
                    data[i] = null;
                    return true;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    private Student empty(){
        return new Student("", 0);
    }
}
