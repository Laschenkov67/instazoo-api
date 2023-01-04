package entity;

import entity.enums.ERole;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
    private Long id;
    private String name;
    private String username;
    private String lastname;
    private String email;
    private String bio;
    private String password;

    private Set<ERole> role = new HashSet<>();
    private List<Post> post = new ArrayList<>();
    private LocalDateTime createDate;

    /** Отслеживаем когда создан пользователь **/
    protected void onCreateUser() {
        this.createDate = LocalDateTime.now();
    }
}
