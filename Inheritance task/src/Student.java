public class Student extends Person
{
    private String studentNumber;
    private String enrollmentDate;
    private boolean partTime;
    private Lecturer personalTutor;

    public void setStudentNumber(String sn)
    {
        this.studentNumber = sn;
    }

    public String getStudentNumber()
    {
        return this.studentNumber;
    }

    public void setEnrollmentDate(String ed)
    {
        this.enrollmentDate = ed;
    }

    public String getEnrollmentDate()
    {
        return this.enrollmentDate;
    }

    public void setPartTime(boolean p)
    {
        this.partTime = p;
    }

    public boolean isPartTime()
    {
        return this.partTime;
    }

    public void setPersonalTutor(Lecturer pt)
    {
        this.personalTutor = pt;
    }

    public Lecturer getPersonalTutor()
    {
        return this.personalTutor;
    }
}