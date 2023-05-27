import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calcTaxVKpay() {
        val typeCard = "VKPay"
        var sumTransfer: Int = 10_000
        var amount: Int = 4_000

        val result = calcTax(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            amount = amount,
        )
        assertEquals(result, 0)
    }

    @Test
    fun calcTaxVisaMir() {
        val typeCard = "Visa"
        var sumTransfer: Int = 10_000
        var amount: Int = 4_000

        val result = calcTax(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            amount = amount,
        )
        assertEquals(result, 30)
    }

    @Test
    fun calcTaxMastercardMax() {
        val typeCard = "Mastercard"
        var sumTransfer: Int = 79_000
        var amount: Int = 4_000

        val result = calcTax(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            amount = amount,
        )
        assertEquals(result, 26000)
    }

    @Test
    fun calcTaxMastercardMin() {
        val typeCard = "Mastercard"
        var sumTransfer: Int = 1_000
        var amount: Int = 4_000

        val result = calcTax(
            typeCard = typeCard,
            sumTransfer = sumTransfer,
            amount = amount,
        )
        assertEquals(result, 0)
    }

}
