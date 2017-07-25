package xyz.anc4g.places.presentation.eventlist

import xyz.anc4g.places.data.Event
import xyz.anc4g.places.presentation.base.BasePresenter
import xyz.anc4g.places.presentation.base.BaseView

interface EventListContract{
    interface View: BaseView {
        fun setLoading(loading:Boolean)

        fun showEventDetails(eventId: String)

        fun showEventList(eventList: List<Event>)

        fun showLoadingError(error: String)
    }

    interface Presenter:BasePresenter<View>{
        fun navigateToEventDetails(eventId: String)

        fun fetchEventList(showLoading: Boolean)
    }
}
