package _7_progress_be.studentmanagement.controller;

import _7_progress_be.studentmanagement.repositories.ClassARepository;
import _7_progress_be.studentmanagement.repositories.StudentRepository;
import _7_progress_be.studentmanagement.repositories.SubjectRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/progress")
public class ProgressController {
    private StudentRepository studentRepository;
    private SubjectRepository subjectRepository;
    private ClassARepository classARepository;

    public ProgressController(StudentRepository studentRepository, SubjectRepository subjectRepository, ClassARepository classARepository) {
        this.studentRepository = studentRepository;
        this.subjectRepository = subjectRepository;
        this.classARepository = classARepository;
    }

    // Endpoints for progress tracking operations
}