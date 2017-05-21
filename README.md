# Java Project Template #

  This is a template for starting new projects.

It uses the Gradle build system for handling a majority of the basic development tasks.

This repository contains a basic Java Gradle project with a basic .gitignore and .editorconfig

## Gradle Plugins ##

This template has the following gradle plugins pre-enabled. Each serves their own useful purpose.

* __[FindBugs:][findbugs]__ Finds common bugs in Java source code.
* __[Checkstyle Plugin:][checkstyle]__ Helps programmers adhere to a coding standard. 
* __[JaCoCo:][jacoco]__ Unit test coverage reporting.
* __[Versions:][version]__ Helper for finding updates to project dependencies.
* __[Reporter:][reporter]__ Better unit test console reporting.
* __[License:][license]__ Can auto add a license header to source files in the project.
* __[Stats:][stats]__ Every wonder how many lines of source code you have? This plugin is for you.
* __[Versioning][versioning]:__ Generators properties file using SCM versioning info.

## Base Java Dependencies ##

These are the pre-enabled java dependencies for this template project.

* __JUnit [v4.12.0]:__ Java unit testing framework.
* __SLF4J [v1.7.25]:__ Logging facade. Allows for drop in replacement for actual logging implementation.
* __Logback [v1.2.3]:__ Preferred logging implementation for SLF4J.
* __RxJava [vv2.1.0]:__ Functional reactional programming in Java. 
                        I use this is most of my projects which is why it is here.
                        
## Requirements ##

* JDK 8

## Building ##

As this project comes with a gradle wrapper, having Gradle installed is not nessesary. Instead pass
all gradle commands to gradlew (the file extension used will depend on what operating system you are on).

```
git clone https://github.com/thenightwolf/java-template-project
gradlew build
```

## Configuration ##

For the 2.0.0 release of this template, I plan on separating all configuration variables to their own file. 
Until then, most of the configuration can be done in the __build.gradle__ file.

#### Main Class Name ####

You should change the variable __mainClassName__ to point to your project's start class.

#### License Configuration ####

The LICENSE header variables can be found under the license section of the build script. The three main ones are:

```groovy
ext.year
ext.name
ext.email
```

I have also changed the header style for java files from the default JavaDoc style to 
the SlashStar style (normal comment style). This is because if the JavaDoc style is left on,
then they clutter up the JavaDocs.

## License ##

The content here is licensed under the [MIT License](https://opensource.org/licenses/MIT)

[findbugs]: https://docs.gradle.org/current/userguide/findbugs_plugin.html 
[checkstyle]: https://docs.gradle.org/current/userguide/checkstyle_plugin.html
[jacoco]: https://docs.gradle.org/current/userguide/jacoco_plugin.html
[version]: https://github.com/ben-manes/gradle-versions-plugin
[reporter]: https://github.com/ksoichiro/gradle-console-reporter
[license]: https://github.com/hierynomus/license-gradle-plugin
[stats]: https://github.com/aalmiray/stats-gradle-plugin
[versioning]: https://github.com/nemerosa/versioning

