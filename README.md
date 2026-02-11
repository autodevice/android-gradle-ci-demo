# GradleDemo

A minimal Kotlin Android app that builds with Gradle and uploads the APK to AutoDevice via GitHub Actions.

## Build Locally

```bash
./gradlew assembleDebug
```

The debug APK will be at `app/build/outputs/apk/debug/app-debug.apk`.

## CI/CD

The GitHub Actions workflow (`.github/workflows/build.yml`) runs on every push to `main` and on manual dispatch. It builds the debug APK and uploads it to AutoDevice.

## Required Secrets

| Secret | Description |
|--------|-------------|
| `AUTODEVICE_API_KEY` | API key for uploading builds to AutoDevice |
