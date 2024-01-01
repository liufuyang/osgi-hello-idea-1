# README

* https://medium.com/javarevisited/learn-osgi-from-scratch-eclipse-intellij-and-wso2-platform-%EF%B8%8F-bf4c5629e097
* https://felix.apache.org/documentation/tutorials-examples-and-presentations/apache-felix-osgi-tutorial/apache-felix-tutorial-example-1.html
* https://docs.gradle.org/current/samples/sample_building_java_libraries.html
* https://examples.javacodegeeks.com/java-development/core-java/gradle/gradle-osgi-plugin-example/

For Eclipse PDE (Plug-in Development Environment) - this might be helpful
* https://github.com/JaneWardSandy/eclipse-pde-partial-idea?tab=readme-ov-file

## Good knowledge
* https://www.slideshare.net/marcusharringer/develop-and-build-osgi-bundles-without-pain-using-intellij-and-gradle
* https://blog.osgi.org/2017/10/osgi-tooling-workshop-oct-23-ludwigsburg.html

## How to use bnd+gradle
* https://plugins.gradle.org/plugin/biz.aQute.bnd.builder
* https://github.com/bndtools/bnd/blob/master/gradle-plugins/README.md#gradle-plugin-for-non-bnd-workspace-builds
* (could be handy) https://github.com/renatoathaydes/osgi-run

## Good examples here:
* https://github.com/chrisr3/osgi-example/blob/master/api/build.gradle

## How to build jar
Gradle is configured with bnd gradle plugin in,
simply run the jar command will do. It will generate `META-INF/MANIFEST.MF`
by reading `bnd.bnd`.

## Check Jar
```
jar xf build/libs/osgi-hello-idea-1-1.0-SNAPSHOT.jar META-INF/MANIFEST.MF
```

## Gogo command:
```
start file:/<path-to-bundle.jar>
start 4
stop 4
update 4 # when the jar is re-build
```

<img width="1129" alt="image" src="https://github.com/liufuyang/osgi-hello-idea-1/assets/161689/ac0ec05c-cb1e-46fe-93a6-59c43eaf9203">

## Could be helpful:
* https://youtrack.jetbrains.com/issue/IDEA-249686/OSGi-with-Gradle-Bundles-have-same-symbolic-name-and-version-nullnull