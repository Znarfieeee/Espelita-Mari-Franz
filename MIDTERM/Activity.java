import java.util.Scanner;

class Activity {
    

    class Student {
        private String firstName = "";
       private String middleName= "";
       private String lastName= "";
       private String suffix= "";
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getSuffix() {
            return suffix;
        }

        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        public String getFullName() {
            return firstName + " " + middleName + " " + lastName + " " + suffix + " ";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Activity.Student student = new Activity().new Student();

        System.out.print("Enter first name: ");
        student.setFirstName(scanner.next());
        System.out.print("Enter middle name: ");
        student.setMiddleName(scanner.next());
        System.out.print("Enter last name: ");
        student.setLastName(scanner.next());
        System.out.print("Enter suffix: ");
        student.setSuffix(scanner.next());

        System.out.println("Full name: " + student.getFullName());
    }
}