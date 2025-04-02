Resumen del Proyecto: Servicio SOAP de Pokémon

## Descripción General

Has creado un servicio web SOAP que actúa como una capa de integración sobre la API REST de Pokémon (PokeAPI). Este servicio permite a los clientes obtener información sobre Pokémon utilizando el protocolo SOAP, que es útil para sistemas empresariales o legacy que requieren este tipo de integración.

## Componentes Principales

### 1. Estructura del Proyecto

- Proyecto Maven con Spring Boot
- Arquitectura en capas (controlador, servicio, repositorio, modelo)
- Implementación de patrones de diseño (Singleton, Factory, Repository)


### 2. Archivos y Componentes Clave

#### Definición del Contrato SOAP

- **pokemon.xsd**: Define el esquema XML para las operaciones SOAP

- Operaciones: getPokemonDetails, getAllPokemon
- Tipos de datos: pokemon, abilities, etc.





#### Capa de Modelo

- **Pokemon.java**: Clase principal que representa un Pokémon con sus atributos

- Clases anidadas: TypeWrapper, Type, AbilityWrapper, Ability, Sprites



- **PokemonList.java**: Representa una lista paginada de Pokémon


#### Capa de Acceso a Datos

- **PokemonRepository.java**: Interfaz que define operaciones de acceso a datos
- **PokemonRepositoryImpl.java**: Implementación que utiliza RestTemplate para consumir la PokeAPI

- Implementa el patrón Singleton





#### Capa de Servicio

- **PokemonService.java**: Interfaz que define operaciones de negocio
- **PokemonServiceImpl.java**: Implementación que conecta el endpoint SOAP con el repositorio


#### Capa de Endpoint SOAP

- **PokemonEndpoint.java**: Maneja las solicitudes SOAP y las mapea a llamadas de servicio
- **WebServiceConfig.java**: Configura el servicio SOAP y expone el WSDL


#### Clases Generadas por JAXB

- Clases en el paquete **com.pokemon.soap.generated**

- Generadas automáticamente a partir del XSD
- Utilizadas para la serialización/deserialización XML





#### Clase Principal

- **PokemonSoapServiceApplication.java**: Punto de entrada de la aplicación Spring Boot


### 3. Patrones de Diseño Implementados

- **Singleton**: En PokemonRepositoryImpl para garantizar una única instancia
- **Factory**: En PokemonFactory para crear diferentes tipos de Pokémon
- **Repository**: Abstracción del acceso a datos con PokemonRepository
- **Dependency Injection**: Uso de Spring para inyectar dependencias


## Funcionalidades

1. **Obtener Detalles de un Pokémon**

1. Endpoint: getPokemonDetails
2. Parámetro: ID o nombre del Pokémon
3. Retorna: Información detallada (tipo, habilidades, estadísticas, etc.)



2. **Listar Pokémon**

1. Endpoint: getAllPokemon
2. Parámetros: Paginación (opcional)
3. Retorna: Lista de Pokémon con información básica





## Tecnologías Utilizadas

- **Spring Boot**: Framework base
- **Spring WS**: Para la implementación del servicio SOAP
- **JAXB**: Para la generación de clases a partir del XSD
- **Maven**: Gestión de dependencias y construcción
- **Java 17**: Lenguaje de programación


## Flujo de Ejecución

1. El cliente envía una solicitud SOAP al endpoint
2. Spring WS procesa la solicitud y la dirige al PokemonEndpoint
3. El endpoint invoca al servicio correspondiente
4. El servicio utiliza el repositorio para obtener datos de la PokeAPI
5. Los datos se transforman al formato SOAP y se devuelven al cliente


## Pruebas

El servicio puede probarse utilizando:

- Postman: Para enviar solicitudes SOAP manualmente
- SoapUI: Para pruebas más avanzadas
- Curl: Para pruebas desde línea de comandos