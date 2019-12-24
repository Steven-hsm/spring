package entity;

import lombok.Data;

/**
 * @Auther: huangsenming
 * @Date: 2019/12/23 18:37
 * @Description:
 */
@Data
public class User {
    private String userName;
    private String password;
    private String favorite;
    private String nickName;
    private String character;

    public User(String userName, String password, String favorite, String nickName, String character) {
        this.userName = userName;
        this.password = password;
        this.favorite = favorite;
        this.nickName = nickName;
        this.character = character;
    }
}
