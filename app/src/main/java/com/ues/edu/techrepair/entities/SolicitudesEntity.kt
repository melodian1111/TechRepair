package com.ues.edu.techrepair.entities

import androidx.room.Index
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(
    tableName = "Solicitudes",
    foreignKeys = [
        ForeignKey(
            entity = UsuarioEntity::class,
            parentColumns = ["id"],
            childColumns = ["usuario_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["usuario_id"])
    ]
)
data class SolicitudesEntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id: String,
    @ColumnInfo(name = "cliente_id") val clienteId: String,
    @ColumnInfo (name = "categoria") val categoria: String,
    @ColumnInfo (name = "descripcion") val descripcion: String,
    @ColumnInfo (name = "latitud") val latitud: Double,
    @ColumnInfo (name = "longitud") val longitud: Double,
    @ColumnInfo (name = "fecha_creacion") val fechaCreacion: String
)
