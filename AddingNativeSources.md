# Native files (C, C++) implementations in android with **[CMakeList](https://developer.android.com/ndk/guides/cmake)


# Usage

* Make CMakeList.txt file under your android project \app\src\CMakeList.txt 

```
# Sets the minimum version of CMake required to build your native library.
# This ensures that a certain set of CMake features is available to
# your build.

cmake_minimum_required(VERSION 3.4.1)

# Specifies a library name, specifies whether the library is STATIC or
# SHARED, and provides relative paths to the source code. You can
# define multiple libraries by adding multiple add.library() commands,
# and CMake builds them for you. When you build your app, Gradle
# automatically packages shared libraries with your APK.

add_library( # Specifies the name of the library.
             native-lib

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             main/native/native-lib.cpp )
```
* Make your Java file under your android package name . This file will be responsible for accessing native methos . make a java class like MySecure.java 

* Make native file under \app\src\main\ with name 'native'	
* Make your native file name like 'native-lib.cpp' if you have to wrte file in C++ language 
* write your logic/code under this file 
 note:- Native files method are only accessible from your project which has same directory as your method name in native files 
 
// start with Java and make underscore for package name having dot(.) and ten finally your native method name 
```
#include <jni.h>

extern "C" {

    JNIEXPORT jstring JNICALL
// if your package name is just like com.android.example then put you method name as Java_com_android_example_MySecure . Now only MySecure class can access this native method
    Java_com_android_example_MySecure_getAPIKey(JNIEnv *env, jobject instance) {
        return env->("Hello from native");
    }
}
```
* Now got to MySecure.java file 

 access your native file with this code 
 ```
    static {
        System.loadLibrary("native-lib");
    }

    public static native String getAPIKey();
 ```
 
 * Here you just setup your native implementaion. To make actually wokable , you have to put some line of code in app level build.gradle . Now go to app level build.gradle and 
 put this line of code under android block
 ```
 android{
 //....
  externalNativeBuild {
        cmake {
            path 'src/CMakeLists.txt'
        }
    }
//...
 }
 ```
 
* you can call MySecure.getAPIKey() method from your code to access native method content 
****** success ******

*** Some Problems can occur to run the peoject *** 
--> If you have any problems in running projects 

1. Make sure you have NDK installed in your project 
  to confirm this , you can give ndk location from youe local.properties file 
 ```
  ndk.dir=yourPathLocationOfNDK\android-ndk
  
 ```
2. If you got problem in CMake , you have to installed CMake in you Laptop/Computer 
 **[Download CMake](https://cmake.org/download/) form official link , and put it on your file and give it's location in local.properties file in android studio like

 ```
 cmake.dir= ..\sdk\\cmake\\3.10.2.4988404
 ```
 



