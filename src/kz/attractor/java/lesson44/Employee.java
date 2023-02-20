package kz.attractor.java.lesson44;

import java.util.List;

public class Employee {
    private String id;
    private List<String> currentBooks;
    private List<String> issuedBooks;
    private String employeeName;


    public Employee(String id, List<String> currentBooks, List<String> issuedBooks, String employeeName, String password) {
        this.id = id;
        this.currentBooks = currentBooks;
        this.issuedBooks = issuedBooks;
        this.employeeName = employeeName;
    }

    public Employee(String id, String employeeName, String password) {
        this(id, null, null, employeeName, password);
    }
    public Employee() {
        this(null, null, null, null, null);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getCurrentBooks() {
        return currentBooks;
    }

    public void setCurrentBooks(List<String> currentBooks) {
        this.currentBooks = currentBooks;
    }

    public List<String> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(List<String> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }


}
