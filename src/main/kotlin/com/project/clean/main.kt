package com.project.clean

fun main() {
    val machine = CoffeeMachine()
    machine.addCups(15)
    machine.addWater(3000f)
    machine.addCoffeeMold(800f)

    val drink = machine
        .requestACoffee(money = 2000f)
        .chooseACoffee(choice = CoffeeChoice.ESPRESSO)
        .get()

    println(drink)
}
