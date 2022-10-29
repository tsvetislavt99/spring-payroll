package payroll;

import org.springframework.data.jpa.repository.JpaRepository;;

/**
 * EmployeeRepository
 */
interface EmployeeRepository extends JpaRepository<Employee, Long> {

}