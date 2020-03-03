# scala4Android

A minimal scala android template.

Using scala for android dev is extremely easy! just install sbt for your OS(ubuntu,arch,windows) , and do the followings(in console) :

connect your phone with usb debug enabled

cd into scala4Android

sbt

android:run

that's all,main activity will be launched in your phone


for more commands and options in .sbt file or sbt console, please refer to https://github.com/scala-android/sbt-android ,which makes this project possible


# useful libraries:


scaloid

macroid

https://github.com/pfn/iota

In addition,all java libs can be added to librarydependencies in build.sbt,including akka!

# attention

currently only sbt 0.13 and scala 2.11 is supported
