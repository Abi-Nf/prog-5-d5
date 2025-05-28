package com.project.clean

class CoffeeMachine {
    private var coffeeCups: Int = 0
    private var currentWaterCapacity: Float = 0f
    private var currentCoffeeMold: Float = 0f

    fun requestACoffee(money: Float): CoffeeRequest {
        return CoffeeRequest(money, ::requestAVariety)
    }

    fun addWater(capacity: Float) {
        this.currentWaterCapacity += capacity
    }

    fun addCoffeeMold(quantity: Float) {
        this.currentCoffeeMold += quantity
    }

    fun addCups(number: Int) {
        this.coffeeCups += number
    }

    private fun requestAVariety(variety: CoffeeVariety) {
        if ((currentWaterCapacity - variety.waterQuantity) <= 0) {
            throw CoffeeMachineException("Not enough water for a drink")
        }

        if ((currentCoffeeMold - variety.coffeeMoldQuantity) <= 0) {
            throw CoffeeMachineException("Not enough coffee mold")
        }

        if (coffeeCups == 0) {
            throw CoffeeMachineException("Not enough cup for your drink, sorry !")
        }

        currentWaterCapacity -= variety.waterQuantity
        currentCoffeeMold -= variety.coffeeMoldQuantity
        coffeeCups--
    }
}