package com.example.femaledatamanagement

import java.util.Date

class Profile {
    var height: Int = 0
    var weight: MutableMap<Date, Int> = mutableMapOf()
    var periodStartDate : MutableList<Date> = mutableListOf()
    var periodDays : MutableList<Int> = mutableListOf()
}