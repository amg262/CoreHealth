/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbaccess;

import java.util.List;

/**
 *
 * @author agunn1
 */
public interface I_EmployeeDAO {
    
    
    /**
     *
     * @throws DataAccessException
     */
    public abstract void openLocalDBConnection() throws DataAccessException;
    
    /**
     *
     * @return
     * @throws DataAccessException
     */
    public abstract List<Employee> retrieveAllEmployees() throws DataAccessException;
    
    /**
     *
     * @param employeeId
     * @return
     * @throws DataAccessException
     */
    public abstract Employee retreiveEmployeeById(String employeeId) throws DataAccessException;
    
    /**
     *
     * @param employee
     * @throws DataAccessException
     */
    public abstract void saveEmployee(Employee employee) throws DataAccessException;
    
    /**
     *
     * @param employee
     * @throws DataAccessException
     */
    public abstract void deleteEmployee(Employee employee) throws DataAccessException;
    
}
