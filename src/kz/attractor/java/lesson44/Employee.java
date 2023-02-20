package kz.attractor.java.lesson44;

import java.util.List;

public class Employee {
    private String id;
    private List<String> currentBooks;
    private List<String> issuedBooks;
    private String employeeName;


    public Employee(String id, List<String> currentBooks, List<String> issuedBooks, String employeeName) {
        this.id = id;
        this.currentBooks = currentBooks;
        this.issuedBooks = issuedBooks;
        this.employeeName = employeeName;
    }

    public String getId() {
        return id;
    }

    public List<String> getCurrentBooks() {
        return currentBooks;
    }

    public List<String> getIssuedBooks() {
        return issuedBooks;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCurrentBooks(List<String> currentBooks) {
        this.currentBooks = currentBooks;
    }

    public void setIssuedBooks(List<String> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
