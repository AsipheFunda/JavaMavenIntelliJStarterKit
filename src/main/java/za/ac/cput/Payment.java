package za.ac.cput;

public class Payment {
    private String firstName;
    private String lastName;
    private int amount;

    // Argument constructor
    public Payment(String firstName, String lastName, int amount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return amount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int amount) {
        this.amount = amount;
    }

    // ToString
    @Override
    public String toString() {
        return "Payment{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
