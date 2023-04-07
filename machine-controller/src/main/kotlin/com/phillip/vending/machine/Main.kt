package com.phillip.vending.machine

import presenter.KioskMachine
import presenter.VendingMachine
import java.util.*

fun main() {
    println("1번은 키오스크, 2번은 자판기")

    val sc = Scanner(System.`in`)

    when (sc.nextInt()) {
        MachineName.KIOSK_MACHINE -> {
            KioskMachine().init()
        }
        MachineName.VENDING_MACHINE -> {
            VendingMachine().init()
        }
    }
}

object MachineName {
    const val KIOSK_MACHINE = 1
    const val VENDING_MACHINE = 2
}