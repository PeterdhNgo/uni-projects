public class PhdStudent extends Student
{
    private String thesisTitle;
    private Lecturer supervisor;

    public void setThesisTitle(String tt)
    {
        this.thesisTitle = tt;
    }

    public String getThesisTitle()
    {
        return this.thesisTitle;
    }

    public void setSupervisor(Lecturer s)
    {
        this.supervisor = s;
    }

    public Lecturer getSupervisor()
    {
        return this.supervisor;
    }
}