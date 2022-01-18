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
    
    public String toString(int a, String str)
    {
        return "My Name is"+str+" ,My Roll No is-"+a;
    }

}
