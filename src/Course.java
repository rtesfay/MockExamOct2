public class Course {
    //Data members
    private String courseID;
    private String courseName;
    private int creditHours;
    //Default constructor
    public Course()
    {

    }
    //Parametrized constructor
    public Course(String courseID, String courseName, int creditHours){
        this.courseID=courseID;
        this.courseName=courseName;
        this.creditHours=creditHours;
    }
    //methodes
    public String getCourseID(){
        return courseID;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCreditHours(){
        return creditHours;
    }

    public void setCourseID(String courseID){
        this.courseID=courseID;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public void setCreditHours(int creditHours){
        this.creditHours=creditHours;
    }

    public String toString(){
        return this.courseID+" "+this.courseName+" "+this.creditHours;
    }
}


