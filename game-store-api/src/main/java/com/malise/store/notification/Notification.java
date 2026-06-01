package com.malise.store.notification;

import com.malise.store.common.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification extends BaseEntity {

    private String message;
    private String receiver;

    @Enumerated(EnumType.STRING)
    private NotificationLevel level;

    @Enumerated(EnumType.STRING)
    private NotificationStatus status;
}
