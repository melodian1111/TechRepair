# TechRepair 🛠️📱

**TechRepair** es una solución móvil para Android orientada a la gestión eficiente de servicios de reparaciones tecnológicas. La aplicación está construida utilizando los estándares más modernos de desarrollo local en Android, asegurando un rendimiento fluido, un código fácil de mantener y una sólida persistencia de datos.

## 🚀 Tecnologías Principales

El manejo de persistencia local en esta aplicación está impulsado por:
*   **Room Persistence Library**: Implementado en su versión estable más reciente. Actúa como una capa de abstracción sobre SQLite que permite aprovechar toda la potencia de las bases de datos relacionales, garantizando la verificación de consultas SQL en tiempo de compilación.
*   **KSP (Kotlin Symbol Processing)**: Utilizado (en lugar del antiguo KAPT) para el procesamiento de anotaciones de Room. La incorporación de la versión más reciente de KSP optimiza significativamente los tiempos de compilación del proyecto y aprovecha al máximo las capacidades de Kotlin.

## 📂 Arquitectura y Estructura del Código

Para promover las buenas prácticas, la separación de responsabilidades (Separation of Concerns) y facilitar la escalabilidad del proyecto, el código fuente está rigurosamente segmentado en los siguientes paquetes principales:

*   **`📦 entities/` (Modelos de Datos y Tablas)**: 
    Aloja todas las *data classes* de Kotlin (como `UsuarioEntity`, `TecnicoEntity`, `SolicitudesEntity`, etc.). Estas clases están anotadas de forma interactiva con Room para definir y mapear exactamente el esquema de las tablas de la base de datos dentro del código.

*   **`⚙️ dao/` (Data Access Objects)**:
    Contiene las interfaces DAO. Este paquete es exclusivo para definir todas las interacciones con la base de datos (inserciones, actualizaciones, eliminaciones y consultas complejas). Aquí se centraliza la lógica de acceso a los datos, separándola del resto de la aplicación.

*   **`🗄️ database/` (Controlador de la BD)**:
    Incluye la configuración abstracta y el controlador principal de la base de datos (`AppDatabase.kt`). Este paquete es responsable de instanciar la conexión a Room, definir la versión del esquema y registrar todas las entidades y DAOs utilizados.

*   **`📱 views/` (Capa de Presentación)**:
    Un paquete diseñado específicamente para centralizar toda la Interfaz de Usuario. Aquí se agrupan y organizan todas las actividades (*Activities*) de la aplicación, separando completamente la lógica de negocio y de entorno visual del manejo de datos.

## ⚡ Base de Datos Preempaquetada (Pre-packaged Database)

Para ofrecer la mejor experiencia de usuario desde el primer tap, TechRepair utiliza el archivo **`service_delivery.db`** (ubicado en el directorio `app/src/main/assets/`). 

Al implementar una **base de datos preempaquetada**, el sistema **no** tiene que construir ni poblar las tablas desde cero durante el primer arranque de la app. En su lugar, Room copia este archivo que ya cuenta con la estructura predefinida y la información inicial necesaria (como catálogos, estados de solicitud, etc.). Esto se traduce en:
*   **Inicio instantáneo**: La aplicación arranca más rápido sin procesamiento pesado de base de datos en segundo plano.
*   **Datos base listos para usar**: Los usuarios y los técnicos ya dispondrán de los registros predeterminados necesarios para el flujo de la aplicación.