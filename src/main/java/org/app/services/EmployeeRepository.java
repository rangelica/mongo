package org.app.services;

import org.app.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends MongoRepository <Employee, String> {

    /*Employee findByCode(String code);*/
}
