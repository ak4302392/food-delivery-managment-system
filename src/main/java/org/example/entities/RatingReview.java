package org.example.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class RatingReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Order order;

    @ManyToOne(optional = false)
    private User customer;

    @ManyToOne(optional = false)
    private Restaurant restaurant;

    @ManyToOne
    private User partner;

    private Integer rating;

    private String reviewText;

    private LocalDateTime createdAt;
}
