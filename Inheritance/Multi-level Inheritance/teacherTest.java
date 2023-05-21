
public class teacherTest {
	public static void main(String args[]) {
        
		ProgrammingTeacher obj = new ProgrammingTeacher();
		FacultyDesignation faculty = new FacultyDesignation();
		
		System.out.println(obj.teacherName);
		System.out.println(obj.designation);
		System.out.println(obj.subject);
		System.out.println(obj.department);
		System.out.println(obj.university);
		
		obj.does();
		obj.action();
		
		System.out.println("\n");
		System.out.println(faculty.faculty);
		System.out.println(faculty.floor);
		
		faculty.facultyDesignation();
        
	}
}

