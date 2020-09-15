package couture;
import javax.persistence.Entity;

import java.util.Objects;
@Entity
class Employee {

  private String id;
  private String name;
  // private String role;

  Employee() {}

  Employee(String id, String name) {

    this.name = name;
    this.id = id;
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  // public String getRole() {
  //   return this.role;
  // }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  // public void setRole(String role) {
  //   this.role = role;
  // }

  @Override
  public boolean equals(Object o) {

    if (this == o)
      return true;
    if (!(o instanceof Employee))
      return false;
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.id, this.name);
  }

  @Override
  public String toString() {
    return "Employee{" + "id=" + this.id + ", name='" + this.name + '}';
  }
}