fun main() {

    val typeCard = "VKPay"
    var sumTransfer: Int = 0
    val tax: Double = 0.0075
    var amount: Int = 0

    println("Ведите сумму перевода")
    amount = readln().toInt()
    println("Ведите сумму предыдущих перевода")
    sumTransfer = readln().toInt()

    val sumTax = calcTax("Visa", amount, sumTransfer)
    println("Комиссия составит: $sumTax")
}

fun calcTax(typeCard: String, amount: Int, sumTransfer: Int): Int =
    when (typeCard) {
        "VKPay" -> 0
        "Mastercard", "Maestro" -> {
            if (sumTransfer <= 75_000) 0 else ((amount * 0.06 + 20) * 100).toInt()
        }

        "Visa", "Mir" -> {
            ((amount * 0.75) / 100).toInt()
        }

        else -> 0
    }