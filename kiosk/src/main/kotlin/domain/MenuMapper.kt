package domain

import data.Beverage
import data.Coffee
import data.Dessert
import data.Tea
import domain.model.Menu

fun List<Beverage>.toBeverageMenuItem(): Map<Int, Menu.MenuBeverage> {
    val menuBeverageMap = mutableMapOf<Int, Menu.MenuBeverage>()
    for(b: Beverage in this) {
        menuBeverageMap[b.idx] = Menu.MenuBeverage(b.name, b.price)
    }
    return menuBeverageMap
}

fun List<Coffee>.toCoffeeMenuItem(): Map<Int, Menu.Coffee> {
    val coffeeMap = mutableMapOf<Int, Menu.Coffee>()
    for(c: Coffee in this) {
        coffeeMap[c.idx] = Menu.Coffee(c.name, c.price, c.isHot)
    }
    return coffeeMap
}

fun List<Dessert>.toDessertMenuItem(): Map<Int, Menu.Dessert> {
    val dessertMap = mutableMapOf<Int, Menu.Dessert>()
    for(d: Dessert in this) {
        dessertMap[d.idx] = Menu.Dessert(d.name, d.price)
    }
    return dessertMap
}

fun List<Tea>.toTeaMenuItem(): Map<Int, Menu.Tea> {
    val teaMap = mutableMapOf<Int, Menu.Tea>()
    for(t: Tea in this) {
        teaMap[t.idx] = Menu.Tea(t.name, t.price, t.isHot)
    }
    return teaMap
}