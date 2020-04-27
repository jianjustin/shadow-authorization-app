[![Actions Status](https://github.com/jianjustin/shadow-authorization-server/workflows/Java%20CI/badge.svg)](shadow-authorization-server) [![shadow-authorization-server](https://img.shields.io/badge/project-shadow--authorization--server-brightgreen)](https://github.com/jianjustin/shadow-authorization-server) [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) 

本项目是基于SpringBoot2.0 + Spring Security构建的基础权限系统；用于对于业务系统的支撑或者模板。

(目前以单体应用为目标)

## 项目说明

>这一小节我会通过自己对于**认证鉴权**的理解，描述系统的大致雏形。

**角色说明**

* 超级管理员：主要用于系统参数的配置和其他用户的权限分配
* 后台管理用户：用于后续管理业务模块存在，如维护商品信息，维护注册用户信息等等

**表模块说明**

* 用户表：维护用户核心信息，包括账户，密码，注册邮箱等等；后续用户业务信息可通过扩展表的方式实现
* 角色表：用于对用户分配权限
* 资源表：抽象系统资源，包括API资源，系统菜单等等
* 权限表：角色表和资源表的中间表，用于表示角色权限信息
* 组织架构表：表示用户对应的组织架构，后续能够表达另一种权限（待设计...）

**业务说明（版本v1）**

* 通用
	* 登陆后台管理系统
* 超级管理员
	* 角色管理：添加角色｜删除角色
	* 资源管理：添加系统资源｜删除系统资源
	* 权限管理：对指定角色授予权限
* 后台管理用户
	* 对应业务管理

## 如何起步

**如何启动后台应用**

* 拉取项目`git clone git@github.com:jianjustin/shadow-authorization-server.git`
* 初始化表结构（根据该目录下的`initAuthData.sql`初始化表结构和表数据）
* 修改数据库连接信息并启动应用
* 可以通过Postman工具测试接口

**如何启动客户端**

* 拉取项目pages分支`git clone -b pages git@github.com:jianjustin/shadow-authorization-server.git`
* 拉取项目依赖`npm install`
* 运行项目`npm run dev` 或`npm run serve`
* 通过浏览器访问项目

## 项目使用技术

* 服务端
	* Spring Boot2.0
	* Spring Security
	* Mybatis
	* MySQL8.0
	* slf4j
	* io.jsonwebtoken.jjwt
* 客户端
	* Vue.js
	* Vuetify
	* Material Design

## 维护者

[@jianjustin](https://github.com/jianjustin)

## 如何贡献

非常欢迎你的加入！[提一个 Issue](https://github.com/RichardLitt/standard-readme/issues/new) 或者提交一个 Pull Request。


## 使用许可

[MIT](LICENSE) © jianjustin