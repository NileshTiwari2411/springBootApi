package couture;

import java.util.List;
import java.util.ArrayList;
import couture.Employee;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
// import java.util.List;

@RestController
class EmployeeController {

  private final EmployeeRepository repository;

  EmployeeController(EmployeeRepository repository) {
    this.repository=repository;
  }

  // Aggregate root

  List<Employee> findAll() {
    return repository.findAll();
  }


  // Single item


  // @GetMapping("/employees/{id}")
  // Employee findOne(@PathVariable Long id) {

  //   return repository.findById(id)
  //     .orElseThrow(() -> new EmployeeNotFoundException(id));
  // }

}

class CityMapper implements RowMapper<Employee> {
  @Override
  public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
      Employee student = new Employee();
      student.setId(rs.getString("ID"));
      student.setName(rs.getString("NAME"));

      return student;
  }
}