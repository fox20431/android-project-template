本项目是由`gradle init`创建的基础项目拓展而来。

目的就是创建一个干净的Android项目模版。

在拓展的过程中，不断了解Android的构造。

## 复用

当你复用该项目的时候以下几个方面是你应该考虑的。

---
项目根目录
- 将`./build.gradle.kts`的`rootProject.name`修改成你的项目名
- 重置idea，你需要删除文件夹`./.idea`
- 重置git，你需要删除文件夹`./.git`
- 重写`./README.md`
- 为了重写本项目的说明文档， `./README.md` 也应当被删除
---
应用模块
- 将`./app/build.gradle.kts`中`android`闭包的`applicationId`字段修改为你的项目独有的，防止相同的`applicationId`安装包进行覆盖
- `./app/src/main/AndroidManifest.xml`中`application`标签属性`android:label`应该被添加，以便于识别
- 修改 `./app/` 下的包名，避免相互依赖的多个项目包名冲突，不得不提醒的是，当你更改包名的时候，你需要更改对应类下 `package` 包名
---
库模块
- 当你删除库模块时，你应该考虑应用模块对库模块的依赖。
- 
---


## 计划

- 创建一个shell脚本帮助我们完成复用操作

---

Q&A

为什么我无法通过`R`引用资源？

请确保`./app/src/main/AndroidManifest.xml`的`manifest`标签包含`package`属性；请不要使用`src/main/build.gradle.kts`的`android`的闭包的`namespace`属性。

In IntelliJ/Android Studio, How Do I Fix "These Files Do Not Belong to the Project"?

This happened for me when I ignored the .idea/ files. Just do
```shell
rm -rf .idea/
```
And then File -> Invalidate Caches/Restart -> Invalidate And Restart.