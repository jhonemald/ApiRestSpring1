package org.ada.school;

import org.ada.school.model.BookingLocation;
import org.ada.school.model.User;
import org.ada.school.service.BookingServiceI;
import org.ada.school.service.BookingServiceMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class Main
{

    public static void main( String[] args )
    {
        BookingServiceI bookingService = new BookingServiceMap();
        BookingLocation location = new BookingLocation( "Hilton", "Calle 68 # 10 - 11" );
        Calendar calendar = Calendar.getInstance();
        calendar.add( Calendar.DAY_OF_MONTH, 5 );
        User user = new User( "121312", "Santiago", "santiago@mail.com" );

        Date startDate = new Date();
        Date endDate = calendar.getTime();
        bookingService.newLocationBooking( startDate, endDate, user, location );
        bookingService.newTransportBooking( startDate, endDate, user, Collections.singletonList( user ) );
        bookingService.createAllBookings();
    }
}
