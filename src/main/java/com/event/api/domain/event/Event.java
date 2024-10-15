package com.event.api.domain.event;

import com.event.api.domain.coupon.Coupon;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String description;
    private String imgUrl;
    private String eventUrl;
    private Boolean remote;
    private LocalDate date;

}
