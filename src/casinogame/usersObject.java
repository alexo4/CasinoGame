
package casinogame;


public class usersObject {
    protected String username;
    protected String password;
    protected int wallet;

    public usersObject(String username, String password, int wallet) {
        this.username = username;
        this.password = password;
        this.wallet = wallet;
    }
    
    public String toString(){
        return username + ", " + password + ", " +wallet; 
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getWallet() {
        return wallet;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }
    
    
    
    
}
