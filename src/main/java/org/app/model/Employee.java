package org.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;


@Document(collection = "Employee")
public class Employee {

    @Id
    private String id;

    @Indexed(unique = true) //il campo deve essere indicizzato e unique!
    @Field(value = "code")
    private String code;

    @Field(value = "full_name")
    private String fullName;

    @Field(value = "start_date")
    private Date startDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
/*
    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", fullName='" + fullName + '\'' +
                ", startDate=" + startDate +
                '}';
    }
*/

    public Employee() {}
}
