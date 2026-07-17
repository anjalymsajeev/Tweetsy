# Jetpack Compose Tweets Curator

A modern Android application built with **Jetpack Compose** following the **MVVM (Model-View-ViewModel)** architecture. This project demonstrates Android development best practices using Kotlin, Hilt, Navigation Compose, Coroutines, Retrofit, and Clean Architecture.

---

## Overview

The application displays tweets organized by categories. Users can browse categories and view related tweets fetched from a REST API.

The project was built to learn and demonstrate modern Android development using the latest Jetpack libraries and recommended architectural patterns.

---

## Features

- Built entirely with Jetpack Compose
- MVVM Architecture
- Clean Architecture
- Navigation Compose
- Hilt Dependency Injection
- Retrofit REST API Integration
- Kotlin Coroutines
- StateFlow
- Material Design 3
- Repository Pattern
- Scalable and maintainable project structure

---

## Tech Stack

| Category | Technology |
|----------|------------|
| Language | Kotlin |
| UI | Jetpack Compose |
| Architecture | MVVM, Clean Architecture |
| Dependency Injection | Hilt |
| Networking | Retrofit |
| Concurrency | Kotlin Coroutines, Flow |
| State Management | StateFlow |
| Navigation | Navigation Compose |
| JSON Parsing | Gson |
| Design | Material Design 3 |

---

## Architecture

```
Presentation (Compose UI)
        │
        ▼
    ViewModel
        │
        ▼
    Repository
        │
        ▼
Retrofit API Service
        │
        ▼
     REST API
```

The application follows the MVVM architecture to separate UI, business logic, and data layers, resulting in better maintainability, testability, and scalability.

---

## Project Structure

```
app
├── data
│   ├── api
│   ├── model
│   └── repository
│
├── di
│
├── navigation
│
├── ui
│   ├── components
│   ├── screens
│   └── theme
│
├── viewmodel
│
└── utils
```

---

## Learning Objectives

This project demonstrates:

- Building UI with Jetpack Compose
- Implementing MVVM Architecture
- Dependency Injection using Hilt
- Navigation between Compose screens
- REST API integration using Retrofit
- State management using ViewModel and StateFlow
- Asynchronous programming with Kotlin Coroutines
- Clean Architecture principles
- Material Design 3 implementation

---

## Screenshots

Add application screenshots here.

| Home | Details |
|------|---------|
| Screenshot | Screenshot |

---

## Getting Started

### Prerequisites

- Android Studio Hedgehog or later
- JDK 17 or above
- Android SDK 35

### Clone the Repository

```bash
git@github.com:anjalymsajeev/Tweetsy.git
```

### Build the Project

```bash
./gradlew build
```

---

## Future Enhancements

- Room Database
- Offline Caching
- Paging 3
- Search Functionality
- Unit Testing
- UI Testing
- Dark Theme Support
- CI/CD with GitHub Actions

---

## Author

**Anjaly Sajeev**

Senior Android Developer | Solution Architect

GitHub: https://github.com/anjalymsajeev

LinkedIn: https://www.linkedin.com/in/anjaly-sajeev-464481157

---

## License

This project is intended for learning and demonstration purposes.
