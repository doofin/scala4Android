enablePlugins(AndroidApp)
enablePlugins(AndroidProtify)
dexMulti := true
scalaVersion := "2.11.12"
platformTarget := "android-21"
libraryDependencies ++=
  Seq("org.scaloid" %% "scaloid" % "4.2")

// android:packageDebug
//"com.android.support" % "appcompat-v7" % "24.0.0",
