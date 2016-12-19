func timeDifference(firstHour: Int,
                    firstMinute: Int, 
                    secondHour: Int, 
                    secondMinute: Int) -> Int {
    var hourDifference = secondHour - firstHour
    var minuteDifference = secondMinute - firstMinute

    if minuteDifference < 0 {
        hourDifference -= 1
        minuteDifference += 60
    }

    return hourDifference * 60 + minuteDifference
}

print(timeDifference(firstHour: 12, firstMinute: 22, secondHour: 12, secondMinute: 25))
print(timeDifference(firstHour: 12, firstMinute: 25, secondHour: 12, secondMinute: 22))
print(timeDifference(firstHour: 12, firstMinute: 00, secondHour: 22, secondMinute: 13))