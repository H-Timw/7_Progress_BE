package _7_progress_be.studentmanagement.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
public class StudentSubjectKey implements Serializable {
    private int studentId;
    private int subjectId;

}
