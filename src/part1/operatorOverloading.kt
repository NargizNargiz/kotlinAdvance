package part1

import java.lang.StringBuilder

class Time(val hours: Int,val min: Int){
    operator fun plus(time: Time): Time{
        val minuts = this.min + time.min
        val hoursInMinuts = minuts/60
        val remainingMin = minuts%60
        val newHours = (this.hours+ time.hours + hoursInMinuts)%24
        return Time(newHours, remainingMin)
    }
}
// overloading operator example with extension
operator fun StringBuilder.plus(sb: StringBuilder){
    sb.forEach { this.append(it)}
}

fun main(){
    val sumTimes = Time(1,2) + Time(2,3)
    println(sumTimes)

    val sb = StringBuilder()
    for (str in sb){
        str + "Zzz"
    }
}