package com.malise.store.game;


import com.malise.store.category.Category;
import com.malise.store.comments.Comments;
import com.malise.store.common.BaseEntity;
import com.malise.store.wishlist.WishList;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Game extends BaseEntity {

    private String title;

    @Enumerated(EnumType.STRING)
    private SupportedPlatforms supportedPlatforms;

    private String coverPicture;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "game")
    private List<Comments> comments;

    @ManyToMany
    @JoinTable(
            name = "game_wishlist",
            joinColumns = {
            @JoinColumn(name = "game_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "wishlist_id")
    }
    )
    private List<WishList> wishLists;
}
