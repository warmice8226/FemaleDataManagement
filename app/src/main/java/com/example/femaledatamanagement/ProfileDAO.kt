package com.example.femaledatamanagement

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProfileDAO {
    @Insert
    fun insertProfile(profile: ProfileEntity)

    @Query("SELECT * FROM ProfileEntity")
    fun getAllProfiles(): List<ProfileEntity>

}