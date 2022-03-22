package org.ada.school.model;

import java.util.UUID;

public class BookingLocation
{
    private final String id;

    private String name;

    private String address;

    public BookingLocation( String name, String address )
    {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.address = address;
    }
}
