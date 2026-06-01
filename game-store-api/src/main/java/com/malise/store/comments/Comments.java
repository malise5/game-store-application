package com.malise.store.comments;

import com.malise.store.common.BaseEntity;
import com.malise.store.game.Game;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Comments extends BaseEntity {

    private String content;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;
}
