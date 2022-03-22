package org.ada.school.service;

import org.ada.school.model.AccommodationBooking;
import org.ada.school.model.Booking;
import org.ada.school.model.BookingLocation;
import org.ada.school.model.BookingStatusEnum;
import org.ada.school.model.TransportBooking;
import org.ada.school.model.User;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class BookingServiceMap
    implements BookingServiceI
{
    Map<String, Booking> bookingMap = new HashMap<>();


    @Override
    public Booking newLocationBooking( Date startDate, Date endDate, User user, BookingLocation location )
    {
        Booking booking = new AccommodationBooking( startDate, endDate, user, BookingStatusEnum.IN_PROGRESS, location );
        bookingMap.put( booking.getId(), booking );
        return booking;
    }

    @Override
    public Booking newTransportBooking( Date startDate, Date endDate, User user, List<User> passengersList )
    {
        TransportBooking transportBooking =
            new TransportBooking( startDate, endDate, user, BookingStatusEnum.ACTIVE, passengersList );
        bookingMap.put( transportBooking.getId(), transportBooking );
        return transportBooking;
    }

    @Override
    public Booking update( String id, Date startDate, Date endDate, BookingStatusEnum status )
    {
        if ( bookingMap.containsKey( id ) )
        {
            Booking booking = bookingMap.get( id );
            booking.update( startDate, endDate, status );
            return booking;
        }
        return null;
    }

    @Override
    public void delete( String id )
    {
        bookingMap.remove( id );
    }

    @Override
    public Optional<Booking> findById( String id )
    {
        if ( bookingMap.containsKey( id ) )
        {
            Booking booking = bookingMap.get( id );
            return Optional.of( booking );
        }
        else
        {
            return Optional.empty();
        }
    }

    @Override
    public void createAllBookings()
    {
        bookingMap.forEach( (key, booking) -> booking.createBooking() );
    }


}
