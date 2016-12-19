var N = 5

// the current leap year
var leapYear = 2016

// the number of leap years that were printed so far
var cnt = 0

// until we print N years
while cnt < N {
    // print the next leap year
    print(leapYear)

    // increase the counter
    cnt += 1

    // go to the next leap year
    leapYear += 4 
    if leapYear % 100 == 0 && leapYear % 400 != 0 {
        leapYear += 4
    }
}