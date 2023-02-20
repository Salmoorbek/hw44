package kz.attractor.java.lesson44;

public class Book {
    private String id;
    private String name;
    private String author;
    private int year;
    private boolean isCoverSolid;
    private String genre;
    private boolean issued;
    private String employeeId;

    public String getId() {
        return id;
    }

    public boolean getIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getDate() {
        return year;
    }

    public void setDate(int year) {
        this.year = year;
    }

    public boolean getIsCoverSolid() {
        return isCoverSolid;
    }

    public void setCoverSolid(boolean coverSolid) {
        isCoverSolid = coverSolid;
    }
}
