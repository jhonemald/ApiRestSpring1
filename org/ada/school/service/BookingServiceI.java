package org.ada.school.service;

import org.ada.school.model.Booking;
import org.ada.school.model.BookingLocation;
import org.ada.school.model.BookingStatusEnum;
import org.ada.school.model.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface BookingServiceI
{
    Booking newLocationBooking( Date startDate, Date endDate, User user, BookingLocation location);

    Booking newTransportBooking( Date startDate, Date endDate, User user, List<User> passengersList);

    Booking update (String id, Date startDate, Date endDate, BookingStatusEnum status );

    void delete(String id);

    Optional<Booking> findById (String id);

    void createAllBookings();

}
