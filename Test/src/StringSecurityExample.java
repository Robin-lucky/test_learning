import java.nio.charset.StandardCharsets;

/**
 * @author Robin
 * @date 2023/5/27
 */
public class StringSecurityExample {
    public static void main(String[] args) {
        String username = "Robin";
        String password = "1129";

        User user = new User(username,password);

        String[] credentials = getUserCredentials(user);

        credentials[0] = "Joyboy";
        credentials[1] = "1224";

        System.out.println("原始用户名："+user.getUsername());
        System.out.println("原始密码："+user.getPassword());


    }

    public static String[] getUserCredentials(User user){
        String[] credentials = new String[2];

        credentials[0] = user.getUsername();
        credentials[1] = user.getPassword();

        return credentials;
    }
}

class User{
    private String username;
    private String password;

    public User(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
