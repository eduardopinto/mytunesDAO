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

public class Content {

    public Content() {
    }

    private int ID;

    private String publisher;

    private String title;

    private float price;

    private java.util.Set users = new java.util.HashSet();

    private void setID(int value) {
        this.ID = value;
    }

    public int getID() {
        return ID;
    }

    public int getORMID() {
        return getID();
    }

    public void setPublisher(String value) {
        this.publisher = value;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setTitle(String value) {
        this.title = value;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(float value) {
        this.price = value;
    }

    public float getPrice() {
        return price;
    }

    public void setUsers(java.util.Set value) {
        this.users = value;
    }

    public java.util.Set getUsers() {
        return users;
    }

//    public String toString() {
//        return String.valueOf(getID());
//    }

    @Override
    public String toString() {
        return "ID=" + ID + ", publisher=" + publisher + ", title=" + title + ", price=" + price + " ";
    }
    
}
