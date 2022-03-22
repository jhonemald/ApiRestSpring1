package org.ada.school.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccommodationBooking extends Booking
{

    List<User> guestList = new ArrayList<>();

    private final BookingLocation bookingLocation;

    public AccommodationBooking( Date startDate, Date endDate, User user, BookingStatusEnum status,
                                 BookingLocation bookingLocation )
    {
        super( startDate, endDate, user, status );
        this.bookingLocation = bookingLocation;

    }

    public void addGuest(User guest){
        guestList.add( guest );
    }


    @Override
    public void createBooking()
    {
        System.out.println("Creating booking for the Accommodation");
    }
}
