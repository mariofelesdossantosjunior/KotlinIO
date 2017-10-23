package com.mario.kotlinio

import java.math.BigDecimal

/**
 * Created by mario on 14/07/17.
 */
data class Money(var amount :BigDecimal = BigDecimal.ZERO, var currency: String = "$")