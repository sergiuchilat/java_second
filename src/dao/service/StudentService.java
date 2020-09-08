package dao.service;

import dao.dao.StudentDAO;
import dao.model.Student;

public class StudentService {
    private final StudentDAO studentDAO;

    public StudentService() {
        this.studentDAO = new StudentDAO();
    }
    public Student create(Student student) {
        return this.studentDAO.create(student);
    }

    public Student read(Integer id) {
        return this.studentDAO.read(id);
    }
    public Student[] read() {
        return this.studentDAO.read();
    }

    public Student update(Integer id, Student studentToUpdate){
        return this.studentDAO.update(id, studentToUpdate);
    }

    public boolean delete(Integer id){
        return this.studentDAO.delete(id);
    }
}
