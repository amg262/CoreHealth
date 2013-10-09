/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbaccess;

import java.util.Date;

/**
 *
 * @author agunn1
 */
public class Employee {
    
    private int employeeId;
    private String lastName;
    private String firstName;
    private double hourlyWage;
    private double salary;
    private Date hireDate;
    private String roleId;
    private String statusId;

    /**
     *
     * @param employeeId
     * @param lastName
     * @param firstName
     * @param hourlyWage
     * @param salary
     * @param hireDate
     * @param roleId
     * @param statusId
     */
    public Employee(int employeeId, String lastName, String firstName, double hourlyWage,
            double salary, Date hireDate, String roleId, String statusId) {
        
        this.employeeId = employeeId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.hourlyWage = hourlyWage;
        this.salary = salary;
        this.hireDate = hireDate;
        this.roleId = roleId;
        this.statusId = statusId;
    }

    /**
     * @return the employeeId
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId the employeeId to set
     */
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the hourlyWage
     */
    public double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * @param hourlyWage the hourlyWage to set
     */
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the hireDate
     */
    public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    /**
     * @return the roleId
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * @param roleId the roleId to set
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return the statusId
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.employeeId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (this.employeeId != other.employeeId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee\n{\n" +
                "\nemployeeId: " + employeeId +
                "\nlastName: " + lastName +
                "\nfirstName: " + firstName +
                "\nhourlyWage: " + hourlyWage +
                "\nsalary: " + salary +
                "\nhireDate: " + hireDate +
                "\nroleId: " + roleId +
                "\nstatusId: " + statusId + "\n}\n";
    }

}
