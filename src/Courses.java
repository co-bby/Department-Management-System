

public class Courses extends Instructor {
	  public String courseName= "social";
	   int totalEnrolledStudents=20;


	boolean minimum=true;

//get courseName and enrolled students
	 public void  CourseAndTotalStudents(){

		 System.out.println(this.courseName + " " + "has "+ this.totalEnrolledStudents +" "+  "students");
	 }

//	 get course and Assigned Instructor
	 public void courseAndInstructor(){
		 System.out.println(names + " "+ "teaches" + " " + courseName);
	 }
//	 get cancelled Courses
	 public void cancelledCourses(){
		 if (minimum){
			 System.out.println(this.courseName +" " + "has been cancelled");
		 }

	 }

	public static void main(String[] args) {
		Courses CoursesObj = new Courses();
		CoursesObj.CourseAndTotalStudents();


		CoursesObj.courseAndInstructor();
		CoursesObj.cancelledCourses();

	}





}
