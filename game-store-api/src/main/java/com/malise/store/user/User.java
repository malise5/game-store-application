package com.malise.store.user;

import com.malise.store.common.BaseEntity;
import com.malise.store.gamerequest.GameRequest;
import com.malise.store.notification.Notification;
import com.malise.store.wishlist.WishList;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    private String firstName;
    private String lastName;
    private String email;
    private String profilePictureUrl;

    @OneToOne(mappedBy = "user")
    private WishList wishList;

    @OneToMany(mappedBy = "user")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "user")
    private List<GameRequest> gameRequests;
}
