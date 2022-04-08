import java.util.ArrayList;

public class Instructor extends Person{


    public int totalCoursesTaught;

//    get an Instructor and their type base on Conditions for Q 3.3
    public void instructorAndType( String names, int totalCoursesTaught){
//        part Time lecturer
        if(this.totalCoursesTaught <= 2 & this.totalCoursesTaught >=0){
            System.out.println(this.names + " "+ "is a "+ " part time lecturer");
        }
//        full time lecturer
        else if (this.totalCoursesTaught >= 4 ){
            System.out.println(this.names + " "+ "is a  Full time lecturer");

        }
//        Professor
        else {
            System.out.println(this.names+ " "+ "is a professor");
        }
    }

    public static void main(String[] args) {
Instructor InstructorObj = new Instructor();

InstructorObj.instructorAndType(InstructorObj.names, InstructorObj.totalCoursesTaught);
    }


}
