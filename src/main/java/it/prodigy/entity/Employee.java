package it.prodigy.entity;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE", uniqueConstraints = {@UniqueConstraint(columnNames = {"Ssn"})})
public class Employee {
	
	
/**	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;*/
	@Id
	@Column(name="Ssn")
	private String ssn;
	
	@Column(name="Fname")
	private String firstName;
	
	@Column(name="Mname")
	private char midelName;
	
	@Column(name="Lname")
	private String lastName;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Sex")
	private char sex;
	
	@Column(name="Salary")
	private int salary;
	
	@Column(name="SuperV_ssn")
	private String superSsn;
	
	@Column(name="Dnumber")
	private int dnumber;
	
	

	public Employee() {
		super();
	}
	
	

	public Employee(String ssn, String firstName, char midelName, String lastName, String address, char sex,
			int salary, String superSsn, int dnumber) {
		
		this.ssn = ssn;
		this.firstName = firstName;
		this.midelName = midelName;
		this.lastName = lastName;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
		this.superSsn = superSsn;
		this.dnumber = dnumber;
	}



/*	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}*/

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getMidelName() {
		return midelName;
	}

	public void setMidelName(char midelName) {
		this.midelName = midelName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSuperSsn() {
		return superSsn;
	}

	public void setSuperSsn(String superSsn) {
		this.superSsn = superSsn;
	}

	public int getDnumber() {
		return dnumber;
	}

	public void setDnumber(int dnumber) {
		this.dnumber = dnumber;
	}

	@Override
	public String toString() {
		return "Employee [ ssn=" + ssn + ", firstName=" + firstName + ", midelName=" + midelName
				+ ", lastName=" + lastName + ", address=" + address + ", sex=" + sex + ", salary=" + salary
				+ ", superSsn=" + superSsn + ", dnumber=" + dnumber + "]";
	}
	
	

}
