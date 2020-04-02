package com.gioco.controller.DAO;

import com.gioco.controller.Tools;
import com.gioco.model.object.Employee;
import com.gioco.model.repository.EmployeeRepo;

import java.util.ArrayList;

public class EmployeeDAO {
    ArrayList<Employee> employees = new ArrayList<>();
    EmployeeRepo employeeRepo = new EmployeeRepo();


    EmployeeDAO() {
        employees.add(employeeRepo.getJamaEmplooyee());
    }


    /*
    public Employee addEmployee() {
        Tools.printTitle("Gioco - Agregando nuevo empleado.");

        String nickname = Tools.getString("nickname");
        String password = Tools.getString("password");
        String firstName = Tools.getString("primer nombre");
        String secondName = Tools.getString("segundo nombre");
        String middleName = Tools.getString("apellido paterno");
        String lastName = Tools.getString("apellido materno");
        String fullName = firstName + " " + secondName + " " + middleName + " " + lastName;
        String bornDate = Tools.getString("fecha de nacimiento (DD/MM/YYYY)");
        String email = Tools.getString("email");
        String phoneNumber = Tools.getString("número de teléfono");
        int userType = 1;
        String since = "Caracteristica inhabil";
        int status = 1;
        int idSupervisor = 0; //Caracteristica inhabil
        String branch = Tools.getString("sucursal");

        return new Employee(nickname, password, firstName, secondName, middleName, lastName, fullName, bornDate, email, phoneNumber, userType, since, status, idSupervisor, branch);
    } */
}
