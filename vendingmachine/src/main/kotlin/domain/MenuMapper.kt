package domain

import data.Coffee
import data.Tea
import domain.model.Menu

fun List<Coffee>.toCoffeeMenuItem(): Map<Int, Menu.Coffee> {
    val coffeeMap = mutableMapOf<Int, Menu.Coffee>()
    for(c: Coffee in this) {
        coffeeMap[c.idx] = Menu.Coffee(c.name, c.price, c.isHot)
    }
    return coffeeMap
}

fun List<Tea>.toTeaMenuItem(): Map<Int, Menu.Tea> {
    val teaMap = mutableMapOf<Int, Menu.Tea>()
    for(t: Tea in this) {
        teaMap[t.idx] = Menu.Tea(t.name, t.price, t.isHot)
    }
    return teaMap
}