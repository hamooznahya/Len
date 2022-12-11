package com.bemotioninc.sss.utils

import java.text.SimpleDateFormat
import java.util.*
import java.util.regex.Pattern

object Utils {
    fun isValidEmailId(email: String): Boolean {
        return Pattern.compile(
            "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                    + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                    + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                    + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                    + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$"
        ).matcher(email).matches()
    }


    fun Boolean.toErrorOrNull(): String? {
        return if (this) null else " "
    }




    fun String.convertStringToDate(): Date? {
        val dateFormat = SimpleDateFormat("hh:mm:ss", Locale.ENGLISH)
        return try  { dateFormat.parse(this) } catch (e:Exception){
            null
        }
    }
    fun Long.convertLongToDateString(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH)
        return try  {
            val date = Date(this)
            dateFormat.format(date) } catch (e:Exception){
            ""
        }
    }

    /**
     * Mahmoud
     * check if text is null or empty then return true
     *
     * @param text
     * @return
     */
    fun isNullOrEmpty(text: String?): Boolean {
        return !(text != null && !text.trim() .isEmpty())
    }

}