package com.example.vehicles.models;

import com.example.vehicles.models.Enums.FuelType;
import com.example.vehicles.models.Enums.VehicleType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

@Entity
@NoArgsConstructor
@Data
@Table(name = "vehicles")
public class Vehicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически

    @NotNull
    private String name; //Поле не может быть null, Строка не может быть пустой

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "coord_id", nullable = false)
    private Coordinates coordinates; //Поле не может быть null
    @NotNull
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически

    @Min(0)
    @NotNull
    private Integer enginePower; //Поле не может быть null, Значение поля должно быть больше 0

    @NotNull
    private Double fuelConsumption; //Поле может быть null, Значение поля должно быть больше 0

    @NotNull
    @Enumerated(EnumType.STRING)
    private VehicleType type; //Поле может быть null

    @NotNull
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @NotNull
    private Integer wheelsNumber;

    @Min(0)
    @NotNull
    private Integer mileage;

    @PrePersist
    public void prePresist(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        creationDate = LocalDateTime.now();
    }
}
