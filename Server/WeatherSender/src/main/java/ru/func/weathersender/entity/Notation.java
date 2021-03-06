package ru.func.weathersender.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author func 21.12.2019
 */
@Entity
@Table(name = "notations")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notation {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String timestamp;
    @Column(nullable = false)
    private Float temperature;
    @Column(nullable = false)
    private Float pressure;
    @Column(nullable = false)
    private Float humidity;
    @Column(nullable = false)
    private String addition;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private Boolean isPublic;
}
