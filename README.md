# StreamShift TV v2

Original Android TV / Google TV / Fire TV IPTV player source project.

## v2 features
- M3U / M3U Plus playlist URL loading
- Xtream-compatible login (server URL + username + password)
- Channel group/category parsing and filtering
- Search across channel names and groups
- Local favorites (long-press a channel)
- Recent channel history
- Media3 / ExoPlayer playback
- TV launcher support and remote-friendly focus controls
- EPG-ready: Xtream XMLTV URL is derived and stored locally for the next guide implementation

## Content policy / intended use
StreamShift TV contains no channels, subscriptions, credentials, or media sources. Users must supply URLs and credentials for content they are authorized to access. The project is not affiliated with TiviMate or any IPTV provider.

## Build
Open this folder in a current Android Studio installation, allow Gradle to sync, then use **Build > Build APK(s)**. The project targets Android TV-compatible Android devices; Samsung Tizen TVs do not install Android APK files directly.

## Next development targets
XMLTV EPG grid, channel logos, multiple profiles/playlists, parental PIN, backup/restore, and a dedicated Leanback/Compose-for-TV UI.

## Cloud APK build (GitHub Actions)
This project includes `.github/workflows/build-apk.yml`.

1. Put the project in a GitHub repository.
2. Open the repository's **Actions** tab.
3. Select **Build StreamShift TV APK** and choose **Run workflow**.
4. When the run finishes, download the `StreamShiftTV-v2-APK` artifact.
5. Unzip that artifact to get `StreamShiftTV-v2-debug.apk`.

The workflow uses Java 17, Android API 35 / Build Tools 35.0.0, Gradle 8.9, and Android Gradle Plugin 8.7.3. It builds a debug APK for testing. For public distribution, create and protect your own release signing key and use a signed release build.
