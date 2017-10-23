package com.mario.kotlinio

import java.math.BigDecimal

/**
 * Created by mario on 14/07/17.
 */

fun main(args: Array<String>) {

    val tickets = Money(BigDecimal(100),"$")
    val popcorn = tickets.copy(amount = BigDecimal(500), currency = "EUR")

    sendPayment(message = "Good Mario",money = tickets)

    if (tickets != popcorn){
        print("They are different!")
    }

}

fun sendPayment(money: Money,message: String = ""){
    println("Sending ${money.amount}")
}

fun sum(x: Int,y: Int) = x + y

fun conveterToDollars(money: Money) = when (money.currency){
    "$" ->  money
    "EUR" ->  Money(money.amount * BigDecimal(1.10),"$")
    else -> throw IllegalArgumentException("not the currency you're interested")
}

fun BigDecimal.percent(percentage: Int) = this.multiply(java.math.BigDecimal(percentage)).divide(BigDecimal(1000))

fun getMoney(): Money{
    return Money().apply {
        currency = "R$"
        amount = BigDecimal(50)
    }
}

fun getMoneyFromTicket(money: Money): Ticket{
    return with(money){
        Ticket(money,"teste")
    }
}
