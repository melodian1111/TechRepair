package com.ues.edu.techrepair.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey
import androidx.room.ColumnInfo
import androidx.room.Index

@Entity(
    tableName = "Contratacion",
    foreignKeys = [
        ForeignKey(
            entity = PropuestasEntity::class,
            parentColumns = ["id"],
            childColumns = ["propuesta_id"],
            onDelete = ForeignKey.RESTRICT
        )
    ],
    indices = [Index(value = ["propuesta_id"], unique = true)])
data class ContratacionEntity(
    @PrimaryKey
    @ColumnInfo (name = "id_local") val id: String,
    @ColumnInfo (name = "propuesta_id") val propuestaId: String,
    @ColumnInfo (name = "fecha_contratacion") val fechaContratacion: String
)