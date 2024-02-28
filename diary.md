# Diary of Changes to the project

## Task 1
- Update Libraries to latest versions
- Fix issues for the code to support latest version, registering receivers with intention using the RECEIVER_EXPORTED / RECEIVER_NOT_EXPORTED flag was introduced as part of Android 13 and is now a requirement for apps running on Android 14 or higher (U+).
- Update minSdkVersion from 31 to 21
- Refactor code to verify correct sdk versions that support PIP
- Refactor media player code, setDataSource and call player prepare before play to comply with Lollipop sdk 21 requirements
- Update strings to inform when Picture in Picture is not available

## Task 2
- Fix instrumented tests to support Android Lollipop sdk 21
- TODO include new tests

## Task 3
- Implemented a new Repository class to separate time information from ViewModel
- Created a continue method to keep counting when back from the other activity
- TODO add dependency injection to better manage Repository
- TODO move variable job out of viewmodel to enable clock to keep counting