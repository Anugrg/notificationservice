package asia.ait.sad.notifications;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class UserToken implements Serializable{
    @Id
    String id;

    private String user_id; // user table f
    private String token;

    public UserToken(){

    }

    public UserToken(String id, String user_id, String token) {
        this.id = id;
        this.user_id = user_id;
        this.token = token;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
