package xyz.anc4g.places.data.landmarksapi

import retrofit2.Call
import xyz.anc4g.places.data.Landmark
import xyz.anc4g.places.data.QueryFilter

interface LandmarkApiManager {
    fun getLandmarks(queryFilter: QueryFilter): Call<List<Landmark>>
}
