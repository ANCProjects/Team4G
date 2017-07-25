package xyz.anc4g.places.data

import java.util.Date


data class Event(
        val id: String,
        val name: String,
        val date: Date,
        val category: Category,
        val location: Location)

data class Landmark(
        val id:Long,
        val name:String,
        val location: Location
)

data class Category(
        val id: String,
        val name: String)

data class Location(
        val latitude: Double,
        val longitude: Double,
        val address: String)

data class QueryFilter(
        val category: Category,
        val location: Location)
