package couture;
import couture.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

// @RepositoryConfig(cacheName="brand")
interface EmployeeRepository extends JpaRepository<Employee,String> {

	// @Query("Select * from brand")
	// public List<Employee> findAll();


}