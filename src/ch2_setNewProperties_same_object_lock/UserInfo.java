package ch2_setNewProperties_same_object_lock;

/**
 * Created by xu on 2017/6/7.
 */
public class UserInfo {
    private String username;
    private String password;

    public UserInfo() {

    }

    public UserInfo(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}