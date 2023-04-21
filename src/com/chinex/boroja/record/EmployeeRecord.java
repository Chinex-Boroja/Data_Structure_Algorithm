package com.chinex.boroja.record;

public record EmployeeRecord(String name, int employeeNumber) {

    public static final String DEFAULT_EMPLOYEE_NAME = "Boroja";

    public EmployeeRecord {
        if (employeeNumber < 0) {
            throw new IllegalArgumentException("employee number cannot be negative");
        }
    }

    public String nameToUpperCase() {
        return name.toUpperCase();
    }
}

// Compact constructor and canonical constructor are used for some kind of validation on the data
