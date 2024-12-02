package com.example.femaledatamanagement

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ProfileEntity(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val height: Int,
    val weight: Int,
)