package com.example.reminderapp.business.domain.util

import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class DateUtil
@Inject
constructor(
    private val dateFormat: SimpleDateFormat
)
{

    fun removeTimeFromDateString(sd: String): String{
        return sd.substring(0, sd.indexOf(" "))
    }

    fun getCurrentTimestamp(): String {
        return dateFormat.format(Date())
    }

}