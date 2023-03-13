//Author Asiphe Funda 215092317
package za.ac.cput;

public class User {
    private String loginId;
    private String password;

    public User(String loginId, String password) {
        this.loginId = loginId;
        this.password = password;
    }

    public static User createUser(String s, String userPassword) {
        return null;

    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {

        this.loginId = loginId;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

