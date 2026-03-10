class Teacher {

 private String teacherName;
 private String subject;
 private double salary;

 public Teacher(String teacherName, String subject, double salary){
     this.teacherName = teacherName;
     this.subject = subject;
     this.salary = salary;
 }

 public String getTeacherName(){
     return teacherName;
 }

 public String getSubject(){
     return subject;
 }

 public double getSalary(){
     return salary;
 }

 public void setTeacherName(String teacherName){
     this.teacherName = teacherName;
 }

 public void setSubject(String subject){
     this.subject = subject;
 }

 public void setSalary(double salary){
     this.salary = salary;
 }
}

public class Tester {
 public static void main(String[] args) {

 Teacher t1 = new Teacher("Alex","Java Fundamentals",1200);
 Teacher t2 = new Teacher("John","RDBMS",800);
 Teacher t3 = new Teacher("Sam","Networking",900);
 Teacher t4 = new Teacher("Maria","Python",900);

 Teacher[] teachers = {t1,t2,t3,t4};

 for(int i=0;i<teachers.length;i++)
 {
 System.out.println("Name : "+teachers[i].getTeacherName()+", Subject : "+teachers[i].getSubject()+", Salary : "+teachers[i].getSalary());
 }
 }
}
