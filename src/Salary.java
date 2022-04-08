public class Salary {

    Instructor instructorObj= new Instructor();
      int baseSalary = 2500 * instructorObj.totalCoursesTaught;
      int fullTimeBonusSalary= 5000;
      int professorBaseBonusSalary= 1500 ;
      int professorBonusSalary= professorBaseBonusSalary* instructorObj.totalCoursesTaught;


    //Get an Instructor salary based on number of courses taught
     public void instructorSalary(){
//          Part Time lecturer salary
          if(instructorObj.totalCoursesTaught<=2 && instructorObj.totalCoursesTaught>=0){
              System.out.println("Total Salary = " +" " +baseSalary);

          }
//          Full Time lecturer Total Salary when he teaches exactly 4
             else if(instructorObj.totalCoursesTaught <=4 ){
              System.out.println("Total Salary = " +" " +baseSalary);

    }
//             Full Time when he teaches more than 4
             else if(instructorObj.totalCoursesTaught >4){
             System.out.println(" Base Salary = " +" "  +"GHS"+baseSalary+ " " + "Bonus Salary="+" " +
                     "GHS" +fullTimeBonusSalary+" "+
                     "Total Salary ="+" "+
                     "GHS"+ baseSalary+ +fullTimeBonusSalary);

         }
//             get a Professor Salary
    else {
        System.out.println(" Base Salary = " +" "  +"GHS"+baseSalary+ " " + "Bonus Salary="+" " +
                "GHS" +professorBonusSalary+" "+
                "Total Salary ="+" "+
                "GHS"+ baseSalary+ +professorBonusSalary);

    }


    }

    public static void main(String[] args) {
        Salary salaryObj = new Salary();
        salaryObj.instructorSalary();
    }
}
