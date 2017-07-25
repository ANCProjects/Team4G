package xyz.anc4g.places.data.eventsapi

import retrofit2.Call
import xyz.anc4g.places.data.Event
import xyz.anc4g.places.data.QueryFilter

interface EventApiManager {

    fun getEvents(queryFilter: QueryFilter): Call<List<Event>>

}
