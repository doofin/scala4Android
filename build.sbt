enablePlugins(AndroidApp)
enablePlugins(AndroidProtify)
dexMulti := true
scalaVersion := "2.11.12"
platformTarget := "android-28"
libraryDependencies ++=
  Seq("com.android.support" % "appcompat-v7" % "24.0.0")

// android:packageDebug
