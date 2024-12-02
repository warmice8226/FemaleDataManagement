package com.example.femaledatamanagement

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ProfileEntity::class], version = 1)
abstract class ProfileDatabase :RoomDatabase() {
    abstract fun profileDao(): ProfileDAO
}