package com.event.api.domain.address;

import com.event.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Table
@Data
@Entity
public class Address {
    @Id
    @GeneratedValue
    private UUID id;
    private String city;
    private String uf;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
