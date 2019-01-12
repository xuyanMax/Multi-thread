package stopThrowLock;

public class SynchronizedObject {
    private String username = "a";
    private String psswd = "aa";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPsswd() {
        return psswd;
    }

    public void setPsswd(String psswd) {
        this.psswd = psswd;
    }

    /*
     * stop 解锁，造成数据不同步
     */
    synchronized public void printString(String username, String password) {
        try {
            this.username = username;

            Thread.sleep(2000);

            this.psswd = password;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
