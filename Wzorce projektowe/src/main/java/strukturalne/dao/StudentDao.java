package dao;

import java.util.List;

public interface StudentDao {
    
    /*
     * interfejs definiuje jakie operacje są potrzebne niezależnie od  zródła danych
     * dopiero implementacja definiuje metody dostępowe
     */
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
