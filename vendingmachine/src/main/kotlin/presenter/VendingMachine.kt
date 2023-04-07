package presenter

import domain.model.Menu
import domain.GetVendingMenuListUseCase

class VendingMachine {

    private val menuMap: Map<Int, Map<Int, Menu>> = GetVendingMenuListUseCase().invoke()

    fun getMenuMap(idx: Int) = menuMap[idx]

    fun init() {
        println("VendingMachine")
    }
}