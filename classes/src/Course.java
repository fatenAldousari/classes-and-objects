public class Course {
String courseName;
String instructor;
int studentsEnrolled;
 
Course (String courseFullName, String instructorName, int numStudentsEnrolled ){
    courseName = courseFullName;
    instructor = instructorName;
    studentsEnrolled =numStudentsEnrolled;
}
public String getcourseName(){
    return courseName;
}
public void setcourseName(String newcourseName){
    courseName = newcourseName;
}
    public String getinstructor(){
    return instructor;
}
public void setinstructor(String newinstructor){
    instructor = newinstructor;
}
public int getstudentsEnrolled(){
    return studentsEnrolled;
}
public void setstudentsEnrolled(int newstudentsEnrolled){
    studentsEnrolled = newstudentsEnrolled;
}

@Override
public String toString() {
    return "course Name: " + courseName + ", instructor: " + instructor + ", studentsEnrolled: " + studentsEnrolled ;
}
 public static void main(String[] args) throws Exception {
       Course summer = new Course("summer", "faten",10);
       System.out.println(summer);
    }
}
   
