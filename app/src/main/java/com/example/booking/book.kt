package com.example.booking

import com.google.gson.annotations.SerializedName
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class Booking(
    val id: Int? = null,
    @SerializedName("guest_name") val guestName: String,
    val data: String,
    val guests: Int
)

interface BookingApi {
    @GET("bookings")
    suspend fun getBookings(): List<Booking>

    @POST("bookings")
    suspend fun addBooking(@Body booking: Booking): Map<String, Int>
}