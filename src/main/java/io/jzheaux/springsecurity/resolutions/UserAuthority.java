package io.jzheaux.springsecurity.resolutions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity(name = "authorities")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserAuthority {
    @Id
    UUID id;

    @Column
    String authority;

    @JoinColumn(name = "username" , referencedColumnName = "username")
    @ManyToOne
    User user;

    public UserAuthority(String authority, User user) {
        this.id = UUID.randomUUID();
        this.authority = authority;
        this.user = user;
    }
}
