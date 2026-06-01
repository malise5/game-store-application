package com.malise.store.wishlist;

import com.malise.store.common.BaseEntity;
import com.malise.store.game.Game;
import com.malise.store.user.User;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WishList extends BaseEntity{
    private String name;

    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "wishLists")
    private List<Game> games;
}
