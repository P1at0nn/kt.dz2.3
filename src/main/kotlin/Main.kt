fun main(args: Array<String>) {
    val itemPrice: Int = 1000 // цена покупки
    val itemCount: Int = 11    // количество покупок
    val discount: Int = 100  // скидка  если сумма покупок от 1_001 до 10_000
    val discountmax: Double = 0.05 // скидка если   от 10_001
    var totalPrice: Int = 0   //итоговая сумма покупки
    var totalPricewithDiscount = 0   // итоговая цена со скидкой
    val regularCustomer: Boolean = true //ежемесечный покупатель
    var finalyprice: Int = 0  // цена если применяется скидка постоянно гопокупателя


    totalPrice = itemPrice * itemCount  // считаем  сумму покупки
    println("сумма покупок без скидо $totalPrice")


    if (totalPrice >= 1_001 && totalPrice <= 10_000) { //считаем скидку в 100р
        totalPricewithDiscount = totalPrice - discount
        println("цена после применения скидки в 100р $totalPricewithDiscount")
    }
    if (totalPrice >= 10_001) {
        totalPricewithDiscount = totalPrice - (totalPrice * discountmax).toInt()  //  считаем скидку 0.05
        println("цена после применения скидки 5% $totalPricewithDiscount")
    }




    if (regularCustomer == true) {
        finalyprice = (totalPricewithDiscount - (totalPricewithDiscount * 0.01)).toInt()
        println("вы  постоянный покупатель: ")
        println(finalyprice)
    } else {
        totalPricewithDiscount
        println("вы не постоянный покупатель: ")
        println(totalPricewithDiscount)
    }
}
