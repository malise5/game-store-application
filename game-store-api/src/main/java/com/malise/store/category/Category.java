package com.malise.store.category;


import com.malise.store.common.BaseEntity;
import com.malise.store.game.Game;

import java.util.List;

import jakarta.persistence.Entity;
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
public class Category extends BaseEntity {

    private String name;

    private String description;

    @OneToMany(mappedBy = "category")
    private List<Game> games;
}
