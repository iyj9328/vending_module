package data.repository

import data.Coffee

class CoffeeListRepo {
    val coffeeMap = listOf(
        Coffee(21, "에스프레소", 3500, false),
        Coffee(22, "아메리카노", 4000, false),
        Coffee(23, "카페라떼", 4500, false),
        Coffee(24, "카라멜 마끼야또", 5000, false),
        Coffee(25, "콜드브루", 5000, false)
    )
}