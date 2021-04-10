package com.example.theaterManagement.domain

import java.math.BigDecimal
import javax.persistence.*
@Entity
data class Seat(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                val id: Long =0,
                val seatRow : Char='A',
                val num: Int=1,
                val price: BigDecimal= BigDecimal(0),
                val description: String="") {
    override fun toString(): String = "Seat $seatRow-$num $$price ($description)"
}



