Jetpack Compose Tweets Curator

A modern Android application built with Jetpack Compose following the MVVM (Model-View-ViewModel) architecture. This project demonstrates Android development best practices using the latest Jetpack libraries and clean architecture principles.

Features
Built entirely with Jetpack Compose
MVVM Architecture
Navigation Compose
Dagger2 for Dependency Injection
Kotlin Coroutines for asynchronous programming
Retrofit for REST API communication
Repository Pattern
State Management using ViewModel
Category-based Tweet browsing
Modern Material Design UI
Clean and maintainable project structure
Tech Stack
Kotlin
Jetpack Compose
MVVM
Hilt
Navigation Compose
Retrofit
Gson
Kotlin Coroutines
Flow / StateFlow
Material Design 3
Project Overview

The application is a Tweets Curator App that displays tweets grouped by categories. Users can browse different categories and view related tweets fetched from a REST API.

For demonstration purposes, the backend data is hosted on JSONBin.io, which provides a simple REST API for serving JSON data. The same architecture can easily be adapted to work with Firebase or any custom backend service.

Learning Objectives

This project demonstrates:

Building UI with Jetpack Compose
Implementing MVVM Architecture
Dependency Injection using Hilt
Navigation between Compose screens
API integration using Retrofit
Managing UI state with ViewModel and Coroutines
Clean project organization following Android best practices
Architecture
Presentation (Compose UI)
        │
    ViewModel
        │
    Repository
        │
 Retrofit API Service
        │
   JSONBin REST API
