package kz.attractor.java.lesson44;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {
    private static ArrayList<Employee> employees;

    public EmployeeModel() {
        employees = new ArrayList<>(List.of(readEmployee()));
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public static Employee[] readEmployee() {
        Path path = Paths.get("./employee.json");
        String json = "";
        try {
            json = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(json, Employee[].class);
    }
}