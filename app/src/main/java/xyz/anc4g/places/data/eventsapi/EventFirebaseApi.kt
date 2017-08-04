package xyz.anc4g.places.data.eventsapi

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import retrofit2.Call
import xyz.anc4g.places.data.Event
import xyz.anc4g.places.data.QueryFilter

class EventFirebaseApi(databaseReference: DatabaseReference? = FirebaseDatabase.getInstance().reference) : EventApiManager {
    override fun getEvents(queryFilter: QueryFilter): Call<List<Event>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
