package org.ada.school.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransportBooking extends Booking
{

    List<User> passengerList = new ArrayList<>();

    public TransportBooking( Date startDate, Date endDate, User user, BookingStatusEnum status, List<User> passengerList )
    {
        super( startDate, endDate, user, status );
        this.passengerList = passengerList;
    }

    @Override
    public void createBooking()
    {
        System.out.println("Creando Reserva para Transporte");
    }
}
