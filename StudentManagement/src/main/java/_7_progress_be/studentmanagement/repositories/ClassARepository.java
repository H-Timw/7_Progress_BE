package _7_progress_be.studentmanagement.repositories;
import _7_progress_be.studentmanagement.model.ClassA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClassARepository extends JpaRepository<ClassA, Long> {
}
