package com.example.theaterManagement.domain

import javax.persistence.*

@Entity
data class Performance(
            @Id @GeneratedValue(strategy = GenerationType.AUTO)
            val id : Long = 0,
            val title : String = "") {
    @OneToMany(mappedBy = "performance")
    lateinit var bookings : List<Booking>
}