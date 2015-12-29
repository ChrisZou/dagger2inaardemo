# dagger2inaardemo
This is a demo of using dagger2 in an aar which throws java.lang.NoClassDefFoundError, see dagger2 issue 283.  
The `dagger2inaarlib` module is an Android library module which uses dagger2 for DI. And the `app` module is an Android application module which comsumes the `dagger2inaarlib` in an `aar` way: `compile 'com.chriszou:dagger2inaarlib:1.0@aar'`  

Usage:  
1. Go to `dagger2inaardemo/dagger2inaarlib` and run `gradle uploadArchives`. If something goes wrong when running this command, just comment out `compile 'com.chriszou:dagger2inaarlib:1.0@aar'` in the `app` module's build.gradle. This will upload this library to a local maven repo under `$HOME/.m2/repository/`.
2. Then go to dagger2inaardemo and run the app module. You'll see the error when the application starts.
