package com.threecallistos.cmcandroid.utils

import kotlin.math.floor

/* 
EEE : Day ( Mon )
MMMM : Full month name ( December ) // MMMM February   
MMM : Month in words ( Dec )
MM : Month ( 12 )
dd : Day in 2 chars ( 03 )
d: Day in 1 char (3)
HH : Hours ( 12 )
mm : Minutes ( 50 )
ss : Seconds ( 34 )
yyyy: Year ( 2020 ) //both yyyy and YYYY are same
YYYY: Year ( 2020 )
zzz : GMT+05:30
a : ( AM / PM )
aa : ( AM / PM )
aaa : ( AM / PM )
aaaa : ( AM / PM )
*/

class RelativeTime {
    val minuteInSeconds = 60f;
    val hourInSeconds = 60f * 60;
    val dayInSeconds = hourInSeconds * 24;
    val weekInSeconds = dayInSeconds * 7;
    val monthInSeconds = dayInSeconds * 30;
    val yearInSeconds = monthInSeconds * 12;
    var value: Float = 0.0f

    public fun fromNow(deltaSeconds: Float): String {
        if (deltaSeconds < 5) {
            // Just Now
            return "Just now"

        } else if (deltaSeconds < minuteInSeconds) {
            // Seconds Ago
            return stringFromFormat("%1.0f seconds ago", deltaSeconds)

        } else if (deltaSeconds < (minuteInSeconds * 2)) {
            // A Minute Ago
            return "A minute ago"

        } else if (deltaSeconds < hourInSeconds) {
            // Minutes Ago
            return stringFromFormat("%1.0f minutes ago", deltaSeconds / minuteInSeconds)

        } else if (deltaSeconds < (hourInSeconds * 2)) {
            // An Hour Ago
            return "An hour ago"

        } else if (deltaSeconds < dayInSeconds) {
            // Hours Ago
            value = floor(deltaSeconds / hourInSeconds)
            return stringFromFormat("%1.0f hours ago", value)

        } else if (deltaSeconds < (dayInSeconds * 2)) {
            // Yesterday
            return "Yesterday"

        } else if (deltaSeconds < weekInSeconds) {
            // Days Ago
            value = floor(deltaSeconds / dayInSeconds)
            return stringFromFormat("%1.0f days ago", value)

        } else if (deltaSeconds < (weekInSeconds * 2)) {
            // Last Week
            return "Last week"

        } else if (deltaSeconds < monthInSeconds) {
            // Weeks Ago
            value = floor(deltaSeconds / weekInSeconds)
            return stringFromFormat("%1.0f weeks ago", value)

        } else if (deltaSeconds < (dayInSeconds * 61)) {
            // Last month
            return "Last month"

        } else if (deltaSeconds < yearInSeconds) {
            // Month Ago
            value = floor(deltaSeconds / monthInSeconds)
            return stringFromFormat("%1.0f months ago", value)

        } else if (deltaSeconds < (yearInSeconds * 2)) {
            // Last Year
            return "Last year"
        }

        // Years Ago
        value = floor(deltaSeconds / yearInSeconds)
        return stringFromFormat("%1.0f years ago", value)

        return ""
    }




     fun stringFromFormat(format: String,value: Float) : String {

         return  String.format(format,value)
      }


}
