package Person;

public class Main {
    public static void main(String[] args) {

    }

    public class Person {
        // Create three instance variables to store a persons
        // First name, last name, and age
        private String firstName;
        private String lastName;
        private int age;

        // Get the persons first name
        public String getFirstName() {
            return this.firstName;
        }

        // Set the persons first name
        public void setFirstName(String newFirstName) {
            this.firstName = newFirstName;
        }

        // Get the persons last name
        public String getLastName() {
            return this.lastName;
        }

        // Set the persons last name
        public void setLastName(String newLastName) {
            this.lastName = newLastName;
        }

        // Get the persons age
        public int getAge() {
            return this.age;
        }

        // Set the person age
        public void setAge(int newAge) {
            if ((newAge >= 0) && (newAge <= 100)) {
                this.age = newAge;
            } else {
                this.age = 0;
            }
        }

        // Check if the person is a teen
        public boolean isTeen() {
            return ((this.age > 12) && (this.age < 20));
        }

        // return the persons full name. Check if the name is missing
        // one or more fields (firstName or secondName)
        public String getFullName() {
            if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
                return "";
            } else if (this.firstName.isEmpty()) {
                return this.lastName;
            } else if (this.lastName.isEmpty()) {
                return this.firstName;
            } else {
                return this.firstName + " " + this.lastName;
            }
        }

    }
}
