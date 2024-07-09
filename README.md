

# Harry Potter Characters KMM App

This project is a Kotlin Multiplatform Mobile (KMM) =Kotlin Multiplatform project targeting Android, iOS, Desktop= application that fetches and displays a list of Harry Potter characters using various libraries 
such as Ktor for networking, Koin for dependency injection, Voyager for navigation, Jetpack Compose for UI and more.

# Features

- Fetches a list of Harry Potter characters from an API.
- Displays the list of characters.
- On selecting a character, displays detailed information about the selected character.

# Libraries Used

- **Kamel** - Image loading library for Kotlin Multiplatform.
- **Koin Core** - Lightweight dependency injection framework for Kotlin.
- **Ktor** - Framework for building asynchronous servers and clients in connected systems using the powerful Kotlin programming language.
- **Voyager** - A simple, yet fully-featured multiplatform navigation library for Compose.
- **Coroutines-swing** - Library support for Kotlin coroutines with Swing.

# Project Structure

  - ComposeMain: Contains the shared Kotlin code for both Android and iOS platforms.
        data: Network-related code (API service, data models).
        di: Dependency injection modules.
        navigation: Navigation implementation.
        presentation: Views and ViewModels for managing UI-related data.

  - androidApp: Contains the Android-specific code.
        MainActivity.kt: Entry point for the Android app.
        UI Components: Compose-based UI components.

  - iosApp: Contains the iOS-specific code.
        AppDelegate.swift: Entry point for the iOS app.
        UI Components: SwiftUI-based UI components.

 ## Acknowledgements     
 
- Instructor: Caner Türe for providing the [course](https://www.youtube.com/watch?v=fWHdkwO-2S8)  and resources.      
