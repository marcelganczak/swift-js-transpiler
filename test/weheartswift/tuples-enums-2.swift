enum CoinType: Int {
    case Penny = 1
    case Nickle = 5
    case Dime = 10
    case Quarter = 25
}


var moneyArray:[(Int,CoinType)] = [(10,.Penny),
                                   (15,.Nickle),
                                   (3,.Quarter),
                                   (20,.Penny),
                                   (3,.Dime),
                                   (7,.Quarter)]

var totalMoney = 0

for (amount, coinType) in moneyArray {
    totalMoney += amount * coinType.rawValue
}

print(totalMoney)