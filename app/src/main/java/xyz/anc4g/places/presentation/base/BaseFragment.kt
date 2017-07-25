package xyz.anc4g.places.presentation.base

import android.support.v4.app.Fragment
import xyz.anc4g.places.R


class BaseFragment: Fragment() {
    /**
     * Starts a fragment and adds it to back stack.
     *
     * @param fragment - fragment to start
     */

    fun startFragment(fragment:Fragment){
        activity.supportFragmentManager.
                beginTransaction()
                .replace(R.id.container, fragment, fragment.javaClass.simpleName)
                .commit()

    }
}