package com.example.theaterManagement.services

import com.example.theaterManagement.data.BookingRepository
import com.example.theaterManagement.data.SeatRepository
import com.example.theaterManagement.domain.Booking
import com.example.theaterManagement.domain.Performance
import com.example.theaterManagement.domain.Seat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service



@Service
class BookingService {
    @Autowired
    lateinit var bookingRepository: BookingRepository

    @Autowired
    lateinit var seatRepository: SeatRepository

    fun isSeatFree(seat : Seat, performance: Performance) : Boolean {
        val matchedBookings = findBooking(seat, performance)
        return matchedBookings == null
    }

    fun findBooking(seat : Seat, performance: Performance) : Booking? {
        val bookings = bookingRepository.findAll()
        val matchedBookings = bookings.filter { it.seat == seat && it.performance == performance }
        return matchedBookings.firstOrNull()
    }

    fun ReserveSeat(seat : Seat, performance: Performance, customerName : String) : Booking{
        val booking = Booking(0, customerName)
        booking.seat = seat
        booking.performance = performance
        bookingRepository.save(booking)
        return booking
    }

    fun findSeat (num : Int, row : Char) : Seat?{
        val seats = seatRepository.findAll()
        return seats.filter { it.seatRow == row && it.num == num }.firstOrNull()
    }
}