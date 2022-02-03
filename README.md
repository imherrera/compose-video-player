# Compose Video Player
Video player for Android Compose powered by ExoPlayer.

## Adding Dependency

* Add the JitPack repository to your build file in your root build.gradle at the end of repositories:
```groovy
allprojects {
    repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

*  Add the dependency
```groovy
dependencies {
    implementation 'com.github.imherrera:compose-video-player:0.1.0-alpha'
}
```

## Basic Usage

The basic usage is as follows:

```kotlin
val playerState = rememberVideoPlayerState()

VideoPlayer(playerState = playerState) {
    VideoPlayerControl(
        state = playerState,
        title = "Elephant Dream",
    )
}

LaunchedEffect(Unit) {
    playerState.player.setMediaItem(MediaItem.fromUri("http://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4"))
    playerState.player.prepare()
    playerState.player.playWhenReady = true
}
```

This will display the video in your Compose layout that shows the video provided. 
For fullscreen example you can take a look at [SampleActivity](sample_app/src/main/java/com/example/composeplayersample/MainActivity.kt)

