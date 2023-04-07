package untitled

import domain.model.Menu
import domain.GetKioskMenuListUseCase

class KioskManager {
    private val menuMap: Map<Int, Map<Int, Menu>> = GetKioskMenuListUseCase().invoke()

    fun getMenuMap(idx: Int) = menuMap[idx]

    companion object {
        const val ADD_MORE = 1
        const val PROGRESS_PAYMENT = 2
    }
}