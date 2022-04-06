本项目是由`gradle init`创建的基础项目拓展而来。

目的就是创建一个干净的Android项目模版。

在拓展的过程中，不断了解Android的构造。

---

Q&A

为什么我无法通过`R`引用资源？

请确保`src/main/AndroidManifest.xml`的`manifest`标签包含`package`属性；请不要使用`src/main/build.gradle.kts`的`android`的闭包的`namespace`属性。