package com.bus.booking.bus_booking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
public class BookingDTO {
    private int id;
    private String name;
    private int age;
    private long phone;
    private int busId;
    private String busName;
    private String to;
    private String from;
    private LocalDate busDate;
    private float cost;

    /*
    *  private int bookingId;
    private String bookingName;
    private int age;
    private int phone;
    private int busId;
    private String busName;
    private String source;
    private String destination;
    private LocalDate busDate;
    private float cost;*/
}
