package pl.alex.javaStart.lessons.staticc.Student;

//Student - pozwala przechowywać informację o imieniu, nazwisku i numerze indeksu studenta
//University - klasa z metodą main, w której utworzysz kilku (co najmniej 2 studentów)
public class Student {
    public static int NUMBER_OF_STUDENTS=0;
    private int index;
    private String firstName;
    private String lastName;

    public Student(String firstName, String lastName) {
        this.index = ++NUMBER_OF_STUDENTS;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getIndex() {
        return index;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        return this.index+". "+this.firstName+" "+this.lastName;
    }
}
