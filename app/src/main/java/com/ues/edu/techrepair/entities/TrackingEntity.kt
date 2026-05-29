package com.ues.edu.techrepair.entities

import androidx.room.Index
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(
    tableName = "Tracking_events",
    foreignKeys = [
        ForeignKey(
            entity = ContratacionEntity::class,
            parentColumns = ["id"],
            childColumns = ["contratacion_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["contratacion_id"])]
)
data class TrackingEntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id: String,
    @ColumnInfo (name = "contratacion_id") val contratacionId: String,
    @ColumnInfo (name = "latitud") val latitud: Double,
    @ColumnInfo (name = "longitud") val longitud: Double,
    @ColumnInfo (name = "registrado_en") val registradoEn: String
)
