/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 * @author Akash
 */
public class PartTimeStudent extends Student {
    private int numCourse;
    
    public PartTimeStudent(String studentId,String studentName, int numCourse){
        super(studentId,studentName);   //call the constructor of the student class.
        this.numCourse=numCourse;   
    }

    public int getNumCourse() {
        return numCourse;
    }

    public void setNumCourse(int numCourse) {
        this.numCourse = numCourse;
       
        super.setStudentId (studentId);
        
    }
    
    
    
    
}
