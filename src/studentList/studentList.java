
package studentList;

import Student.Student;

public class studentList {
    public static void main(String[] args){
        Student[] studentList = new Student[4];
        studentList[0] = new Student("1","Ronak Sheth");
        studentList[1] = new Student("2","John Doe");
        studentList[2] = new Student("3","abc");
        
        for(int  i = 0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
        
    }
}