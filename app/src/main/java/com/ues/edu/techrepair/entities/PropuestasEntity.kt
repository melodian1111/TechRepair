package com.ues.edu.techrepair.entities

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "Propuestas_servicio",
    foreignKeys = [
        ForeignKey(
            entity = SolicitudesEntity::class,
            parentColumns = ["id"],
            childColumns = ["solicitud_id"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = TecnicoEntity::class,
            parentColumns = ["id_usuario"],
            childColumns = ["tecnico_id"],
            onDelete = ForeignKey.CASCADE
        )
    ],
    indices = [
        Index(value = ["solicitud_id"]),
        Index(value = ["tecnico_id"])
    ]
)
data class PropuestasEntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id: String,
    @ColumnInfo(name = "solicitud_id") val solicitudId: String,
    @ColumnInfo(name = "tecnico_id") val tecnicoId: String,
    @ColumnInfo (name = "evaluacion_complejidad") val evaluacionComplejidad: EvaluateComplex,
    @ColumnInfo (name = "comentarios") val comentarios: String,
    @ColumnInfo (name = "estado") val estado: String = "Enviada",
    @ColumnInfo (name = "fecha_creacion") val fechaCreacion: String
)
