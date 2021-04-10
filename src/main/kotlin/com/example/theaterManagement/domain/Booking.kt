package com.example.theaterManagement.domain

import javax.persistence.*

@Entity
data class Booking(
            @Id @GeneratedValue(strategy = GenerationType.AUTO)
            val id : Long = 0,
            val customerName : String = "") {
    @ManyToOne
    lateinit var seat : Seat
    @ManyToOne
    lateinit var performance : Performance


}