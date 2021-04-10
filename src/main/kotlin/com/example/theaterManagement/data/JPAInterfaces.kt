package com.example.theaterManagement.data

import com.example.theaterManagement.domain.Booking
import com.example.theaterManagement.domain.Performance
import com.example.theaterManagement.domain.Seat
import org.springframework.data.jpa.repository.JpaRepository

interface PerformanceRepository : JpaRepository<Performance, Long>
interface SeatRepository : JpaRepository<Seat, Long>
interface BookingRepository : JpaRepository<Booking, Long>