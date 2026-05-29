package com.ues.edu.techrepair.entities

import androidx.room.Entity
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

@Entity(tableName = "Usuario")
data class UsuarioEntity(
    @PrimaryKey
    @ColumnInfo (name = "id") val id: String,
    @ColumnInfo (name = "nombre_completo") val nombreCompleto: String,
    @ColumnInfo (name = "correo_electronico") val correoElectronico: String,
    @ColumnInfo (name = "telefono") val telefono: String,
    @ColumnInfo (name = "rol") val rol: RolUsuario,
    @ColumnInfo (name = "foto_perfil_url") val fotoPerfilUrl: String,
    @ColumnInfo (name = "fecha_registro") val fechaRegistro: String
)
