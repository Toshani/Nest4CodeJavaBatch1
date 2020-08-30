public class Switch 
{
        
        // Instance Variables
        String studentName;
        int assignedMarks;
        int age;
        String sem;
        int year;
        
        // Constructor
        

        public Switch(String n, int am, int a, int y, String sm) {
            studentName = n;
            assignedMarks = am;
            age = a;
            year = y;
            sem = sm;
        }
        
        // Instance Methods or Functions
        void firstName() {
            System.out.println("Pratyaksh");
        }
        
        public void lastName() {
            System.out.println("Taparia");
        }
        
        public void age() {
            System.out.println("22");
        }
        
        public void year() {
            System.out.println("2020");
        }
        
        public void sem() {
            System.out.println("VIII");
        }
        
        public void display() {
            System.out.println("Name :" + studentName);
            System.out.println("Assigned Marks :" + assignedMarks);
            System.out.println("Age :" + age);
            System.out.println("Year :" + year);
            System.out.println("Semester :" + sem);
        }
}