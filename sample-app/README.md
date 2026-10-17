# Compose Starter

A minimal, conventional **Kotlin + Jetpack Compose (Material 3)** Android starter
app. Single activity, one home screen with a greeting and a Material 3 button that
increments a counter held in `rememberSaveable` state.

This is a clean scaffold meant as a starting point for new apps. It has **not been
compiled** in the environment it was generated in (no Android SDK was present); it is
intended to be opened and built with Android Studio or a machine that has the Android
SDK installed.

## Requirements

- **Android Studio** Ladybug (2024.2.1) or newer, or the command-line Android SDK.
- **JDK 17** (the project targets JVM 17).
- **Android SDK** with platform **API 35** installed.

## Project facts

- Application ID / namespace: `com.ayushbairagya.starter`
- Display name: **Compose Starter**
- `minSdk` 24, `targetSdk` / `compileSdk` 35
- Java / Kotlin JVM target: 17
- Single-activity, Jetpack Compose UI with Material 3 and dynamic color (Android 12+)

## Pinned versions

Dependencies are declared in a Gradle **version catalog** at
[`gradle/libs.versions.toml`](gradle/libs.versions.toml):

| Component | Version |
| --- | --- |
| Android Gradle Plugin (AGP) | 8.7.3 |
| Kotlin | 2.1.0 |
| Compose BOM | 2024.12.01 |
| androidx core-ktx | 1.15.0 |
| androidx lifecycle-runtime-ktx | 2.8.7 |
| androidx activity-compose | 1.9.3 |
| JUnit | 4.13.2 |
| androidx.test.ext junit | 1.2.1 |
| Espresso core | 3.6.1 |

Kotlin 2.x requires the Compose compiler Gradle plugin
(`org.jetbrains.kotlin.plugin.compose`), which is applied in the module build file.
Individual Compose artifacts (`ui`, `ui-graphics`, `material3`, …) are versionless
because their versions come from the Compose BOM.

## Open / build / run

### Android Studio (recommended)

1. **File → Open** and select this `sample-app/` directory.
2. Let Gradle sync. Android Studio will download the Gradle distribution declared in
   the wrapper and any missing SDK components.
3. Pick a device/emulator and press **Run**.

### Command line

```bash
# From this directory (sample-app/)
./gradlew assembleDebug      # build the debug APK
./gradlew test               # run the JVM unit tests
./gradlew installDebug       # install on a connected device/emulator
```

You need `local.properties` to point at your SDK (Android Studio writes this
automatically), e.g.:

```properties
sdk.dir=/path/to/Android/Sdk
```

## Gradle wrapper note

This project includes the Gradle wrapper (`gradlew`, `gradlew.bat`,
`gradle/wrapper/gradle-wrapper.jar`, and `gradle/wrapper/gradle-wrapper.properties`)
pinned to **Gradle 8.11.1**. If the `gradle-wrapper.jar` is ever missing or you prefer
to regenerate it, run:

```bash
gradle wrapper --gradle-version 8.11.1
```

or simply open the project in Android Studio, which regenerates the wrapper jar
automatically. Never commit a hand-fabricated placeholder jar — a broken wrapper jar
is worse than a missing one.

## Project structure

```
sample-app/
├── settings.gradle.kts            # module includes + repositories
├── build.gradle.kts               # root plugins (apply false)
├── gradle.properties
├── gradle/
│   ├── libs.versions.toml         # version catalog
│   └── wrapper/
├── gradlew / gradlew.bat
└── app/
    ├── build.gradle.kts           # android {} + compose + dependencies
    ├── proguard-rules.pro
    └── src/
        ├── main/
        │   ├── AndroidManifest.xml
        │   ├── java/com/ayushbairagya/starter/
        │   │   ├── MainActivity.kt       # activity + HomeScreen composable + increment()
        │   │   └── ui/theme/             # Color.kt, Theme.kt, Type.kt
        │   └── res/values/               # strings.xml, themes.xml
        └── test/java/com/ayushbairagya/starter/
            └── ExampleUnitTest.kt        # unit test for increment()
```
