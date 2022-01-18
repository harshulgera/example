class Student
{
    int rollno;
    String name;

    //Adding Constructor
    Student()
    {
        System.out.println("Student Created");
    }
    
    //Parametrized Constructor
    Student(int a, String str)
    {
        rollno=a;
        name=str;
    }

    public int displayRollNo()
    {
        return rollno;
    }

}
