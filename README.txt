# Gestión de Productos

API REST orientada a la gestión de productos e inventario de una tienda, con un enfoque en el desarrollo backend y la organización de datos mediante SQL.

## 📌 Descripción del proyecto

**Gestión de Productos** es un proyecto de desarrollo backend cuyo objetivo es facilitar la administración de la información de productos mediante una estructura de datos relacional.

El repositorio incluye un esquema SQL para definir la estructura de almacenamiento de los productos, con información como nombre, descripción, precio y cantidad.

## 🛠️ Tecnologías y herramientas

- **SQL:** definición y estructuración de datos.
- **Base de datos relacional:** almacenamiento de la información de los productos.
- **API REST:** enfoque para la gestión de recursos desde el backend.

## 🗄️ Estructura de la base de datos

El archivo `schema.sql` contiene la definición de la tabla `tbl_product`.

| Campo | Tipo de dato | Descripción |
|---|---|---|
| `id` | `SERIAL` | Identificador único del producto y clave primaria. |
| `name` | `VARCHAR(255)` | Nombre del producto. |
| `description` | `VARCHAR(255)` | Descripción del producto. |
| `price` | `REAL` | Precio del producto. |
| `quantity` | `INT` | Cantidad disponible del producto. |

Esta estructura permite organizar la información principal de cada producto y facilita su almacenamiento en una base de datos relacional.

## 📂 Estructura del repositorio

```text
gestionDeProductos/
├── gestionDeProductos/   # Código fuente del proyecto
├── schema.sql            # Esquema de la base de datos
└── README.md             # Documentación del proyecto
```

## 🚀 Instalación y configuración

### 1. Clonar el repositorio

```bash
git clone https://github.com/DanielNieves04/gestionDeProductos.git
cd gestionDeProductos
```

### 2. Configurar la base de datos

- Configura un motor de base de datos compatible con el esquema SQL.
- Ejecuta el archivo `schema.sql` para crear la tabla de productos.
- Configura las credenciales y los parámetros de conexión requeridos por el backend.

### 3. Ejecutar la aplicación

Instala las dependencias necesarias y ejecuta el proyecto siguiendo las instrucciones correspondientes al lenguaje y framework utilizados.

> Los comandos específicos de ejecución deben añadirse una vez confirmada la configuración del backend.

## 🎯 Objetivos del proyecto

- Organizar la información de productos mediante una estructura relacional.
- Aplicar conceptos de diseño y administración de bases de datos.
- Trabajar con SQL para definir estructuras de almacenamiento.
- Desarrollar soluciones backend orientadas a la gestión de inventarios.

## 👨‍💻 Autor

**Daniel Nieves**

Ingeniero de Sistemas | Desarrollo Backend | Análisis de Bases de Datos

- GitHub: [DanielNieves04](https://github.com/DanielNieves04)
- LinkedIn: [Perfil profesional](https://www.linkedin.com/in/nieves-urbano-daniel-alejandro-606b58307/)

---

Desarrollado como proyecto de aprendizaje y aplicación de conocimientos en desarrollo backend y gestión de datos.
