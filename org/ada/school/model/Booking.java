package org.ada.school.model;

import java.util.Date;
import java.util.UUID;

public abstract class Booking
{
    private final String id;

    protected Date startDate;

    protected Date endDate;

    protected User user;

    protected BookingStatusEnum status;

    public String getId()
    {
        return id;
    }

    public Booking( Date startDate, Date endDate, User user, BookingStatusEnum status )
    {
        this.id = UUID.randomUUID().toString();
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.status = status;
    }

    public void update(Date startDate, Date endDate, BookingStatusEnum status )
    {
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public abstract void createBooking();
}
