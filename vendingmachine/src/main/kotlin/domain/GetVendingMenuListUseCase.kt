package domain

import data.repository.CoffeeListRepo
import data.repository.TeaListRepo
import domain.model.Menu

class GetVendingMenuListUseCase {
    operator fun invoke(): Map<Int, Map<Int, Menu>> = mapOf(
        1 to CoffeeListRepo().coffeeMap.toCoffeeMenuItem(),
        2 to TeaListRepo().teaMap.toTeaMenuItem()
    )
}