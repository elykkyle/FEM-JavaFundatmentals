package inheritance;

public class Employee extends Person{
    // inheriting from Person class

    private String employeeId;
    private String title;

    public Employee(){
        // explicitly call desired superclass constructor by providing matching params list.
        // super must be first thing in constructor.
        super("kyle");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
