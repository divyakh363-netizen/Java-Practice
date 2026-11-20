package scenario;

public class Employee {
private int id;
private String name;
private double salary;
private String designation;
private double exp;
private String location;
private String gender;
public Employee(int id, String name, double salary, String designation, double exp, String location, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
	this.exp = exp;
	this.location = location;
	this.gender = gender;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getExp() {
	return exp;
}
public void setExp(double exp) {
	this.exp = exp;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}


}
