package _7_progress_be.studentmanagement.model;

import jakarta.persistence.*;

@Entity
class Learn  {
    @EmbeddedId
    StudentSubjectKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "studentId", referencedColumnName = "id")
    Student student;
    @ManyToOne
    @MapsId("subjectId")
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    Subject subject;
    private double mark1;
    private double mark2;


}

