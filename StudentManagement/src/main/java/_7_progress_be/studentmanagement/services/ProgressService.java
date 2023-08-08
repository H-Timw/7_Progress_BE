package _7_progress_be.studentmanagement.services;

import _7_progress_be.studentmanagement.model.ClassA;
import _7_progress_be.studentmanagement.model.EntityNotFoundException;
import _7_progress_be.studentmanagement.model.Student;
import _7_progress_be.studentmanagement.model.Subject;
import _7_progress_be.studentmanagement.repositories.ClassARepository;
import _7_progress_be.studentmanagement.repositories.StudentRepository;
import _7_progress_be.studentmanagement.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgressService {
    private final StudentRepository studentRepository;
    private final SubjectRepository subjectRepository;
    private final ClassARepository classARepository;

    @Autowired
    public ProgressService(StudentRepository studentRepository, SubjectRepository subjectRepository, ClassARepository classARepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
        this.classARepository = classARepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found"));
    }

    public Student updateStudent(Long id, Student student) {
        Student existingStudent = getStudentById(id);
        existingStudent.setName(student.getName());
        existingStudent.setGender(student.getGender());
        existingStudent.setBirthDay(student.getBirthDay());
        return studentRepository.save(existingStudent);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Subject not found"));
    }

    public Subject updateSubject(Long id, Subject subject) {
        Subject existingSubject = getSubjectById(id);
        existingSubject.setName(subject.getName());
        existingSubject.setTerm(subject.getTerm());
        existingSubject.setCount(subject.getCount());
        return subjectRepository.save(existingSubject);
    }

    public void deleteSubject(Long id) {
        subjectRepository.deleteById(id);
    }

    public ClassA saveClassA(ClassA classA) {
        return classARepository.save(classA);
    }

    public List<ClassA> getAllClasses() {
        return classARepository.findAll();
    }

    public ClassA getClassById(Long id) {
        return classARepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Class not found"));
    }

    public ClassA updateClass(Long id, ClassA classA) {
        ClassA existingClass = getClassById(id);
        existingClass.setClassName(classA.getClassName());
        existingClass.setTeacher(classA.getTeacher());
        return classARepository.save(existingClass);
    }

    public void deleteClass(Long id) {
        classARepository.deleteById(id);
    }
}
