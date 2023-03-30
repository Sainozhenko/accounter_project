package project;

public abstract class Employee implements Salary {

        protected String firstName;
        protected String lastName;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public abstract String getPosition();

        public abstract double calculateSalary();
    }

