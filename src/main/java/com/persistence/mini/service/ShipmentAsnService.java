package com.persistence.mini.service;

import com.persistence.mini.entities.ShipmentAsn;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Slf4j
@Service
public class ShipmentAsnService {
    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Autowired
    Employee employee;

    @PersistenceContext
    EntityManager em;
    @Transactional
    public List<ShipmentAsn>getShipmentAsnList(){
        log.info("Employee name: {}",employee.getEmployeeName());
        ShipmentAsn asn1=
                em.createQuery("select asn from ShipmentAsn asn where asn.asn= :asn", ShipmentAsn.class)
                        .setParameter("asn",1)
                        .getSingleResult();
        log.info("asn1: {}", asn1);
        em.createQuery("update ShipmentAsn set transitTime= :transitTime where asn=: asn")
                .setParameter("transitTime", 3333)
                .setParameter("asn", 1)
                .executeUpdate();
        log.info("asn1: {}", asn1);

        return null;
    }
}
