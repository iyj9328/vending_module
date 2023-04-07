package domain

import data.Beverage
import data.repository.BeverageListRepo
import data.repository.CoffeeListRepo
import data.repository.DessertListRepo
import data.repository.TeaListRepo
import domain.model.Menu

class GetKioskMenuListUseCase {
    operator fun invoke(): Map<Int, Map<Int, Menu>> = mapOf(
        1 to BeverageListRepo().beverageMap.toBeverageMenuItem(),
        2 to CoffeeListRepo().coffeeMap.toCoffeeMenuItem(),
        3 to DessertListRepo().dessertMap.toDessertMenuItem(),
        4 to TeaListRepo().teaMap.toTeaMenuItem()
    )
}