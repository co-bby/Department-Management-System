
public class Students extends Person {

    int totalRegisteredCourses;
    int grade;

    // get students and their types base on a condition
    public void studentAndType() {
        if (totalRegisteredCourses <= 2 & totalRegisteredCourses <= 0) {
            System.out.println(this.names + " " + "is a part time students");
        } else if (totalRegisteredCourses <= 6) {
            System.out.println(this.names + " " + "is a full time students");

        } else {
            System.out.println("student cannot register more than 6 courses");
        }

    }

    // find a student and the grade
    public void courseAndGrade() {
        Courses courseObj = new Courses();

        if (grade <= 100 & grade > 0) {
            System.out.println(names + " " + "had " + " " + grade + " " + "in" + " " + courseObj.courseName);
        }

    }

    // Find students on probation
    public void studentsOnProbation(String names) {
        if (grade <= 100 && grade >= 0 && (grade * totalRegisteredCourses / totalRegisteredCourses) * 100 > 60) {
            System.out.println(names + " " + "is on probation");
        }
    }

    public static void main(String[] args) {
        Students studentsObj = new Students();

        studentsObj.names = "cobby";
        studentsObj.studentAndType();
        studentsObj.courseAndGrade();
        studentsObj.studentsOnProbation(studentsObj.names);
    }
}
