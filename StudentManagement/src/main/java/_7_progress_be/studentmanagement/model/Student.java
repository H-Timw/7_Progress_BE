package _7_progress_be.studentmanagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String gender;
    private String birthDay;

    @OneToMany(mappedBy = "student")
    Set<Learn> list = new HashSet<Learn>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Id_class",referencedColumnName = "id")
    private ClassA classA;
}
