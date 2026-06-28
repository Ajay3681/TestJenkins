package com.persistence.mini.controller;

import com.persistence.mini.entities.ShipmentAsn;
import com.persistence.mini.service.ShipmentAsnService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/shipment")
public class ShipmentAsnController {
    private final ShipmentAsnService shipmentAsnService;

    public ShipmentAsnController(ShipmentAsnService shipmentAsnService) {
        this.shipmentAsnService = shipmentAsnService;
    }

    @RequestMapping(value = "/get-asn", method = RequestMethod.GET)
    public List<ShipmentAsn>getShipmentAsnList(){
        return shipmentAsnService.getShipmentAsnList();

    }
}
