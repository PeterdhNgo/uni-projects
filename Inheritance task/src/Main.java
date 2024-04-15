public class Main
{
    public static void main(String[] args)
    {
        Person male = new Person();
        male.setName("Peter");
        male.setAddress("KT2 6SN");
        male.setDateOfBirth("26th July 2004");

        System.out.println(male.getName());
        System.out.println(male.getAddress());
        System.out.println(male.getDateOfBirth());

        Lecturer handsomeMale = new Lecturer();
        handsomeMale.setEmployeeNumber("HS1008");
        handsomeMale.setDepartment("Computer Science");

        System.out.println(handsomeMale.getEmployeeNumber());
        System.out.println(handsomeMale.getDepartment());

        Student handsomeStudent = new Student();
        handsomeStudent.setStudentNumber("K2358612");
        handsomeStudent.setEnrollmentDate("18th June");
        handsomeStudent.setPartTime(false);

        System.out.println(handsomeStudent.getStudentNumber());
        System.out.println(handsomeStudent.getEnrollmentDate());
        System.out.println(handsomeStudent.isPartTime());


    }
}