package _7_progress_be.studentmanagement.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name="classA")
@AllArgsConstructor
@NoArgsConstructor
public class ClassA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String className;
    private String teacher;

    @OneToMany(mappedBy = "classA", cascade = CascadeType.ALL)
    private Set<Student> students = new HashSet<Student>();
}
