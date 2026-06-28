package com.persistence.mini.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Entity
@Table(name="asn", schema = "shipment")
@Getter
@Setter
@ToString
public class ShipmentAsn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="asn")
    private Long asn;

    @Column(name="inco_term")
    private String incoTerm;

    @Column(name="transit_time")
    private Integer transitTime;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ShipmentAsn that = (ShipmentAsn) o;
        return Objects.equals(asn, that.asn) && Objects.equals(incoTerm, that.incoTerm) && Objects.equals(transitTime, that.transitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asn, incoTerm, transitTime);
    }
}
