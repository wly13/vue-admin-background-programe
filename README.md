# vue-admin-background-programe
目录结构：
```aidl
database:mysql数据库
src://源码目录
    ||controller：前端控制器-主要是用于写前端调用的接口
    ||dao：数据操作层-主要是写各种数据操作方法的接口
    ||domain（bean）：实体类-主要是写后端实体类(必须有无参构造函数，以及get和set)
    ||service：数据服务层-service层主要调用dao层的功能实现增删改查
    ||Application.java:工程启动类
resources://资源目录
    ||mapper:映射文件-主要是用于写sql语句
    ||mybatis.xml：mybatis配置文件
    ||static：静态资源目录-主要用于存放各种静态资源
    ||application.yml:项目配置文件-主要用于配置数据库访问，系统编码等各种配置
pom.xml：maven配置文件-在 pom.xml 中添加所需要的依赖信息，然后在项目根目录执行 mvn install 命令，maven就会自动下载相关依赖jar包到本地仓库
README.md:项目说明文档
```
功能：
```aidl
数据的查询，删除，添加，修改
用户登录验证
```
后续功能持续完善中ing·····