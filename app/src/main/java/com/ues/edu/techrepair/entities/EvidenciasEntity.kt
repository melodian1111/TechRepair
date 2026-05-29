package com.ues.edu.techrepair.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.Index
@Entity(
    tableName = "Evidencias",
    foreignKeys = [
        ForeignKey(
            entity = SolicitudesEntity::class,
            parentColumns = ["id"],
            childColumns = ["solicitud_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["solicitud_id"])]
)
data class EvidenciasEntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id : String,
    @ColumnInfo (name = "solicitud_id") val solicitudId : String,
    @ColumnInfo (name = "foto_url") val fotoUrl : String,
    @ColumnInfo (name = "fecha_subida") val fechaSubida : String
)