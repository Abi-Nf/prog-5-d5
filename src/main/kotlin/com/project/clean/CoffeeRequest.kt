package com.project.clean

import java.util.function.Supplier

class CoffeeRequest internal constructor(
    money: Float,
    private val requestADrink: RequestADrink
) {
    companion object {
        private const val PRICE_FOR_COFFEE = 2000f

        private fun simulatePreparation() {
            Thread.sleep(5000)
        }
    }

    var money: Float = money
        private set

    init {
        if (money < PRICE_FOR_COFFEE) {
            throw CoffeeRequestException("The price for coffee is $PRICE_FOR_COFFEE")
        }
    }

    fun chooseACoffee(choice: CoffeeChoice): Supplier<CoffeeDrink> {
        requestADrink.request(choice)

        return Supplier<CoffeeDrink> {
            simulatePreparation()
            CoffeeDrink
        }
    }
}