package name;

public class NameContainer {
    String name;
    String surname;

    public NameContainer() {
        this.name = "";
        this.surname = "";    }

    public NameContainer(String name, String surname) {
        this.name = name.strip();
        this.surname = surname.strip();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.strip();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.strip();
    }

    public String printFullname() {
        return name + " " + surname;
    }
}
