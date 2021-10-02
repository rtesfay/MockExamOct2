public class Student {
    public static void main(String[] args) {
        private String stdName;
        private int stdID;
        private double gpa;
        private Course course;
        //Default constructor
    public Student()
        {

        }
        //Parametrized constructor
    public Student(String stdName, int stdID, double gpa, Course course){
            this.stdName = stdName;
            this.stdID = stdID;
            this.gpa = gpa;
            this.course = course;
        }
        //methodes
        public String getStdName () {
            return stdName;
        }
        public int getStdID () {
            return stdID;
        }
        public double getGpa () {
            return gpa;
        }
        public Course getCourse () {
            return course;
        }

        public void setStdName (String stdName){
            this.stdName = stdName;
        }
        public void setStdID ( int stdID){
            this.stdID = stdID;
        }
        public void setGpa ( double gpa){
            this.gpa = gpa;
        }
        public void setCourse (course course){
            this.course = course;
        }
        public String toString () {
            return this.stdName + " " + this.stdID + " " + this.gpa + " " + this.course;

        }
    }
}





