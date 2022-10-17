package weekthree.dayone;


public class Students {
	
public void getStudentInfo(int id )
{
	System.out.println("Student Id : " + id);	
}
public void getStudentInfo(int id , String name)
{
	System.out.println("Student Id:" + id);
	
	System.out.println("Student Name " + name );
}
public void getStudentInfo(String email, String phno)
{
	System.out.println("Student Email " + email);
	
	System.out.println("Student Phone Number " + phno);
	
}
public static void main(String[] args)
{
	Students student =new Students();
	
	student.getStudentInfo(234);
	
	student.getStudentInfo(234, "Eve");
	
	student.getStudentInfo("test@gmail.com", "9664646464");
}

}
