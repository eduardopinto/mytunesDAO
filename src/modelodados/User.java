/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 *
 * This is an automatic generated file. It will be regenerated every time you
 * generate persistence class.
 *
 * Modifying its content may cause the program not work, or your work may lost.
 */
/**
 * Licensee: License Type: Evaluation
 */
package modelodados;

public class User {

    public User() {
    }

    private int ID;

    private String firstName;

    private String lastName;

    private java.util.Set contents = new java.util.HashSet();

    private void setID(int value) {
        this.ID = value;
    }

    public int getID() {
        return ID;
    }

    public int getORMID() {
        return getID();
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setContents(java.util.Set value) {
        this.contents = value;
    }

    public java.util.Set getContents() {
        return contents;
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + ", lastName=" + lastName;
    }

}
