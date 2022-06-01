package lesson5;

public class LoginPage extends Page implements PageInterface{

    private String userName;
    private String password;
    public void populateCredentials(String userName, String password) {
        System.out.println (String.format ("Credentials populated: %s , %s", userName, password));
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public void getDeveloperName(){
        System.out.println("John Smith");
    }

}
