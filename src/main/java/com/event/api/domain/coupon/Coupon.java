package com.event.api.domain.coupon;

import com.event.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;
@Data
@Entity


@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private Integer discount;
    private LocalDate valid;
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
