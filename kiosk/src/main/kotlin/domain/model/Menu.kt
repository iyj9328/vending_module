package domain.model

sealed class Menu {
    abstract val name: String
    abstract val price: Int

    data class Coffee(
        override val name: String,
        override val price: Int,
        val isHot: Boolean
    ) : Menu()

    data class Tea(
        override val name: String,
        override val price: Int,
        val isHot: Boolean
    ) : Menu()

    data class MenuBeverage(
        override val name: String,
        override val price: Int
    ) : Menu()

    data class Dessert(
        override val name: String,
        override val price: Int
    ) : Menu()
}
