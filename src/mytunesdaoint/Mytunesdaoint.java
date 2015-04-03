package mytunesdaoint;

import java.util.Set;
import modelodados.*;
import org.orm.PersistentException;

public class Mytunesdaoint {

    public Mytunesdaoint() {
    }

    public static void main(String[] args) {
        try {
            Mytunesdaoint api = new Mytunesdaoint();

            // adicionar utilizador
            int userId = api.addUser("nuno", "eduardo");

            // adicionar video
            int videoId = api.addVideo("300x300", "Uminho Movies", "Um filme no DI", 50);

            // adicionar music
            int musicId = api.addMusic(4550, "Nuno Eduardo", "Le Love", 33);

            // adicionar app
            int appId = api.addApp("A minha primeira App", "Nuno Eduardo", "Hello World", 400);

            // efetuar compra de um video
            api.addBuy(userId, videoId);

            // efetuar compra de um Musica
            api.addBuy(userId, musicId);

            // efetuar compra de um App
            api.addBuy(userId, appId);

            Set<Content> contents = api.listBuy(userId);

            System.out.println("O utilizador " + api.getUser(userId).toString());
            for (Content content : contents) {
                System.out.println(content.toString());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public int addUser(String firstName, String lastName) throws PersistentException {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);

        if (DAOFactory.getDAOFactory().getUserDAO().save(user)) {
            return user.getID();
        }

        return -1;
    }

    public int addVideo(String resolution, String publisher, String title, float price) throws PersistentException {
        Video video = new Video();

        video.setResolution(resolution);
        video.setPublisher(publisher);
        video.setTitle(title);
        video.setPrice(price);

        if (DAOFactory.getDAOFactory().getVideoDAO().save(video)) {
            return video.getID();
        }

        return -1;
    }

    public int addMusic(int duration, String publisher, String title, float price) throws PersistentException {
        Music music = new Music();

        music.setDuration(duration);
        music.setPublisher(publisher);
        music.setTitle(title);
        music.setPrice(price);

        if (DAOFactory.getDAOFactory().getMusicDAO().save(music)) {
            return music.getID();
        }

        return -1;
    }

    public int addApp(String details, String publisher, String title, float price) throws PersistentException {
        App app = new App();

        app.setDetails(details);
        app.setPublisher(publisher);
        app.setTitle(title);
        app.setPrice(price);

        if (DAOFactory.getDAOFactory().getAppDAO().save(app)) {
            return app.getID();
        }

        return -1;
    }

    public void addBuy(int userID, int contentID) throws PersistentException {
        User user = DAOFactory.getDAOFactory().getUserDAO().getUserByORMID(userID);
        Content content = DAOFactory.getDAOFactory().getContentDAO().getContentByORMID(contentID);

        user.getContents().add(content);
        DAOFactory.getDAOFactory().getUserDAO().save(user);
    }

    public Set<Content> listBuy(int userID) throws PersistentException {
        return DAOFactory.getDAOFactory().getUserDAO().getUserByORMID(userID).getContents();
    }

    public User getUser(int userID) throws PersistentException {
        return DAOFactory.getDAOFactory().getUserDAO().getUserByORMID(userID);
    }

}
