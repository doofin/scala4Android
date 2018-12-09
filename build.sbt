scalaVersion:="2.11.12"
enablePlugins(AndroidApp)
enablePlugins(AndroidProtify)
platformTarget := "android-28"
libraryDependencies ++=
  "com.android.support" % "appcompat-v7" % "24.0.0" ::Nil

// android:packageDebug
