public class Lecturer extends Person
{
    private String employeeNumber;
    private String department;
    private PhdStudent supervisor;
    private Student personalTutor;

    public void setEmployeeNumber(String en)
    {
        this.employeeNumber = en;
    }

    public String getEmployeeNumber()
    {
        return this.employeeNumber;
    }

    public void setDepartment(String dm)
    {
        this.department = dm;
    }

    public String getDepartment()
    {
        return this.department;
    }
}