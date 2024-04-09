package hu.aut.android.kotlinpersonlist.touch

interface PlayerTouchHelperAdapter {

        fun onItemDismissed(position: Int)

        fun onItemMoved(fromPosition: Int, toPosition: Int)
}