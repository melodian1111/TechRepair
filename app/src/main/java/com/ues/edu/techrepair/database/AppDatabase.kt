package com.ues.edu.techrepair.database

import androidx.room.Database
import com.ues.edu.techrepair.entities.*

@Database(
    entities = [ContratacionEntity::class, EstadoSolEntity::class, EvidenciasEntity::class,
        PropuestasEntity::class, SolicitudesEntity::class, TecnicoEntity::class,
        TrackingEntity::class, UbicacionREntity::class, UsuarioEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase {

}