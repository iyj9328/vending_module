package presenter

import domain.model.Menu
import domain.model.Payment
import etc.PaymentManager
import untitled.KioskManager
import java.util.Scanner

class KioskMachine {
    private var orderList = ArrayList<Menu>()

    private val scanner: Scanner by lazy { Scanner(System.`in`) }
    private val kioskManager: KioskManager by lazy { KioskManager() }
    private val paymentManager: PaymentManager by lazy { PaymentManager() }

    fun init() {
        choiceMenu()
    }

    private fun choiceMenu() {
        println("어떤 종류의 메뉴를 주문하시겠습니까? 1.음료, 2.커피, 3.디저트, 4.티")
        val getListIdx = scanner.nextInt()

        kioskManager.getMenuMap(getListIdx).run {
            if (this != null) {
                println("원하시는 메뉴를 번호로 선택해주세요.")
                for(i: Int in this.keys) {
                    println("주문번호: $i, 메뉴이름:${this[i]!!.name}, 가격:${this[i]!!.price}")
                }

                val getMenuIdx = scanner.nextInt()
                addMenuToOrderList(this[getMenuIdx]!!)

                println("메뉴를 추가 진행하시겠습니까? 1.예 / 2.아니오")
                when (scanner.nextInt()) {
                    KioskManager.ADD_MORE -> {
                        choiceMenu()
                    }
                    KioskManager.PROGRESS_PAYMENT -> {
                        choicePayment()
                    }
                }
            } else {
                println("메뉴 번호를 다시 확인해주세요!")
                choiceMenu()
            }
        }
    }

    private fun choicePayment() {
        println("결제방법을 선택해주세요. 1.카드 / 2.현금 / 3. 포인트")
        when (scanner.nextInt()) {
            Payment.CARD -> {
                println("카드로 결제를 진행합니다..")
                paymentManager.payByCard(Payment.Card("name", "card_number"))
                println("결제가 완료되었습니다.")
            }
            Payment.CASH -> {
                paymentManager.payByCash(Payment.Cash(1000))
            }
            Payment.POINT -> {
                paymentManager.payByPoint()
            }
            else -> {
                println("결제수단 번호를 다시 입력해주세요..")
                choicePayment()
            }
        }
    }

    private fun addMenuToOrderList(menu: Menu) {
        orderList.add(menu)
    }
}