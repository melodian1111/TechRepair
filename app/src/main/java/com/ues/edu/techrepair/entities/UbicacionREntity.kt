package com.ues.edu.techrepair.entities

import androidx.room.Index
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(
    tableName = "Ubicacion_recordatorio",
    foreignKeys = [
        ForeignKey(
            entity = UsuarioEntity::class,
            parentColumns = ["id"],
            childColumns = ["usuario_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = SolicitudesEntity::class,
            parentColumns = ["id"],
            childColumns = ["solicitud_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["usuario_id"]), Index(value = ["solicitud_id"])]
)
data class UbicacionREntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id: String,
    @ColumnInfo (name = "usuario_id") val usuarioId: String,
    @ColumnInfo (name = "solicitud_id") val solicitudId: String,
    @ColumnInfo (name = "titulo_area") val tituloArea: String,
    @ColumnInfo (name = "descripcion_area") val descripcionArea: String,
    @ColumnInfo (name = "latitud") val latitud: Double,
    @ColumnInfo (name = "longitud") val longitud: Double,
    @ColumnInfo (name = "radio_metros") val radioMetros: Double,
    @ColumnInfo (name = "esta_activo") val estaActivo: Int = 1
)
