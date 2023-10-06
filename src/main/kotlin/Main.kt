fun main(){
    val isRegular = true
    val itemPrice = 100
    val itemCount = 110
    val discount = 100
    val discountStart = 1_000

    val discountRegularPercent = 1
    val discountBigPercent = 5
    val discountBigStart = 10_000
    val discountPercentDivider = 100

    var amount = itemPrice * itemCount
    if (amount > discountBigStart){
        amount -= amount * discountBigPercent / discountPercentDivider
    } else if (amount > discountStart){
        amount -= discount
    }
    if (isRegular){
        amount -= amount * discountRegularPercent / discountPercentDivider
    }
    print("Сумма покупки $amount руб.")
}