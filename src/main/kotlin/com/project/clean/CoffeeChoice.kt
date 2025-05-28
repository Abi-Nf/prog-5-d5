package com.project.clean

enum class CoffeeChoice : CoffeeVariety {
    ESPRESSO {
        override val coffeeMoldQuantity: Float
            get() = 200f

        override val waterQuantity: Float
            get() = 1000f
    },

    LATTE {
        override val coffeeMoldQuantity: Float
            get() = 150f

        override val waterQuantity: Float
            get() = 800f
    },

    MOCHA {
        override val coffeeMoldQuantity: Float
            get() = 80f

        override val waterQuantity: Float
            get() = 750f
    },

    CHAI {
        override val coffeeMoldQuantity: Float
            get() = 400f

        override val waterQuantity: Float
            get() = 1400f
    }
}