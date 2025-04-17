# 🎵 Aplicación de Reproducción de Audio

Este proyecto es una aplicación orientada a objetos que simula una plataforma de reproducción de contenido de audio, como canciones y podcasts. Utiliza conceptos fundamentales de **Programación Orientada a Objetos (POO)** como **herencia** y **encapsulación**.

## 📚 Descripción

La aplicación tiene como objetivo representar una biblioteca básica de audios, permitiendo la reproducción, el registro de 'me gusta', y la clasificación de contenido. A través de una jerarquía de clases, se modelan los distintos tipos de audio como:

- 🎵 Canciones
- 🎙️ Podcasts

### 🧠 Conceptos Aplicados

- **Herencia:** Una clase base `Audio` sirve como superclase para otras como `Canción` y `Podcast`.
- **Encapsulación:** Uso de atributos privados y métodos `get`/`set` para acceder y modificar datos de forma controlada.

## ⚙️ Tecnologías Utilizadas
- ☕ Java (versión 8 o superior)
- 💻 IDE recomendado: IntelliJ IDEA 
- Sistema de compilación: javac y ejecución con java

## 🏗️ Estructura del Proyecto

```plaintext
Audio (superclase)
├── título
├── duración
├── total_reproducciones
├── me_gusta
├── clasificación
├── reproducir()
├── getters/setters
│
├── Cancion (subclase)
│   ├── artista
│   └── género
│
└── Podcast (subclase)
    ├── presentador
    └── número de episodio
