enablePlugins(AndroidApp)
//enablePlugins(AndroidProtify) // enable this makes app launch very slow,but fast to deploy!
//dexMulti := true
scalaVersion := "2.11.12"
platformTarget := "android-21"
//libraryDependencies ++=Seq("org.scaloid" %% "scaloid" % "4.2") //
/*Warning: org.scaloid.common.TraitWebView$class: can't find referenced method 'int getVisibleTitleHeight()' in library class android.webkit.WebView*/

// android:packageDebug
//"com.android.support" % "appcompat-v7" % "24.0.0",
