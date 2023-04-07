package domain.model

sealed class Payment {
    data class Card(
        val name: String,
        val bankIdentificationNumber: String
    ): Payment()
    data class Cash(
        val money: Int
    ): Payment()
    data class Point(
        val amountPoint: Int
    ): Payment()

    companion object {
        const val CARD = 1
        const val CASH = 2
        const val POINT = 3
    }
}
