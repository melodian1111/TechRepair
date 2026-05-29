package com.ues.edu.techrepair.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.Index
@Entity(
    tableName = "Estado_solicitud",
    foreignKeys = [
        ForeignKey(
            entity = SolicitudesEntity::class,
            parentColumns = ["id"],
            childColumns = ["solicitud_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = UsuarioEntity::class,
            parentColumns = ["id"],
            childColumns = ["actor_id"],
            onDelete = ForeignKey.RESTRICT
        )
    ],
    indices = [
        Index(value = ["solicitud_id"]),
        Index(value = ["actor_id"])
    ]
)
data class EstadoSolEntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id: String,
    @ColumnInfo (name = "solicitud_id") val solicitudId: String,
    @ColumnInfo (name = "actor_id") val actorId: String,
    @ColumnInfo (name = "estado") val estado: String,
    @ColumnInfo (name = "fecha_cambio") val fechaCambio: String
)
