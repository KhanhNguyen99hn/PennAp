# PennApps 2019
  In an attempt to help people save money, this project was created to accomplish that in a way that is fun an interesting to the user.
  The goal of the project is to get the user to save more money. In order to do so they must "take care of" the Pokémon on the screen. 
  If the user of the application spends too much money the Pokémon will die. The Pokémon will evolve to the next level if the user saves enough money in their bank account.
## Installation and Running the app
  Andriod Studio must be used to run the application, and the device use to test the application was a Samsung Galaxy Note 8 running on   Android 8.0.
  
  All dependencies that must be installed can be found in the build.gradle (Module: apps) file.
  ```
  dependencies {
    implementation fileTree(dir: 'libs', include: ['*.jar'])
    implementation 'com.android.support:appcompat-v7:28.0.0'
    implementation 'com.android.support:design:28.0.0'
    implementation 'com.android.support.constraint:constraint-layout:1.1.3'
    implementation 'com.android.support:support-vector-drawable:28.0.0'
    testImplementation 'junit:junit:4.12'
    androidTestImplementation 'com.android.support.test:runner:1.0.2'
    androidTestImplementation 'com.android.support.test.espresso:espresso-core:3.0.2'
}
  ```
