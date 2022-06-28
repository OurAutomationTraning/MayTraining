package encapsulation;

public class Student {
    private String fullName;

    public void setFullName(String name) {
        fullName = name;
    }

    public String getFirstName() {
        return fullName.split(" ")[0];
    }

    public String getMiddleName() {
        return fullName.split(" ")[1];
    }

    public String getLastName() {
        return fullName.split(" ")[2];
    }
}
