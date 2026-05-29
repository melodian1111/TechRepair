package com.ues.edu.techrepair.entities

import androidx.room.Index
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
@Entity(
    tableName = "Tecnico",
    foreignKeys = [
        ForeignKey(
            entity = UsuarioEntity::class,
            parentColumns = ["id"],
            childColumns = ["usuario_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [Index(value = ["usuario_id"])]
)
data class TecnicoEntity(
    @PrimaryKey
    @ColumnInfo (name = "id_usuario") val idUsuario: String,
    @ColumnInfo (name = "especialidad") val especialidad: String,
    @ColumnInfo (name = "calificacion_promedio") val calificacionPromedio: Float,
    @ColumnInfo (name = "esta_disponible") val estaDisponible: Int,
    @ColumnInfo (name = "verificado") val verificado: Int = 0
)
