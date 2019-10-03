package org.app.model;

import java.time.LocalDate;

public class EmployeeDTO {

    private String code;
    private String fullName;
    private LocalDate dataAdesso;

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

    public LocalDate getDataAdesso() {
        return dataAdesso;
    }

    public void setDataAdesso(LocalDate dataAdesso) {
        this.dataAdesso = dataAdesso;
    }
}
