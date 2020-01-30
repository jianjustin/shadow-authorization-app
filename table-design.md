* **用户表设计**

  ```sql
  /*mysql insert sql*/
  CREATE TABLE `sys_user` (
    `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '用户Id',
    `username` varchar(100) NOT NULL COMMENT '用户名',
    `password` varchar(100) NOT NULL COMMENT '密码',
    `phone` varchar(11) DEFAULT NULL COMMENT '手机',
    `sex` varchar(6) DEFAULT NULL COMMENT '性别',
    `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
    `mark` varchar(100) DEFAULT NULL COMMENT '备注',
    `rank` varchar(10) DEFAULT NULL COMMENT '账号等级',
    `lastLogin` date DEFAULT NULL COMMENT '最后一次登录时间',
    `loginIp` varchar(30) DEFAULT NULL COMMENT '登录ip',
    `imageUrl` varchar(100) DEFAULT NULL COMMENT '头像图片路径',
    `regTime` date NOT NULL COMMENT '注册时间',
    `locked` tinyint(1) DEFAULT NULL COMMENT '账号是否被锁定',
    PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
  ```

  ```sql
  /*postgresql insert sql*/
  CREATE SEQUENCE sys_user_id_seq;
  CREATE TABLE sys_user (
    id int NOT NULL  DEFAULT nextval('sys_user_id_seq'),
    username varchar(100) NOT NULL,
    password varchar(100) NOT NULL,
    phone varchar(11) DEFAULT NULL,
    sex varchar(6) DEFAULT NULL,
    email varchar(100) DEFAULT NULL,
    mark varchar(100) DEFAULT NULL,
    rank varchar(10) DEFAULT NULL,
    lastLogin date DEFAULT NULL,
    loginIp varchar(30) DEFAULT NULL,
    imageUrl varchar(100) DEFAULT NULL,
    regTime date NOT NULL,
    locked int DEFAULT NULL,
    PRIMARY KEY (id)
  );
  ```

  



* **角色表设计**

  ```sql
  /*mysql insert sql*/
  CREATE TABLE `sys_role` (
    `roleId` int(12) NOT NULL AUTO_INCREMENT COMMENT '角色Id',
    `roleName` varchar(100) DEFAULT NULL COMMENT '角色名称',
    `roleDesc` varchar(100) DEFAULT NULL COMMENT '角色描述',
    `role` varchar(100) DEFAULT NULL COMMENT '角色标志',
    PRIMARY KEY (`roleId`)
  ) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
  ```

  ```sql
  /*postgresql insert sql*/
  CREATE SEQUENCE sys_role_id_seq;
  CREATE TABLE sys_role (
    roleId int NOT NULL DEFAULT nextval('sys_role_id_seq'),
    roleName varchar(100) DEFAULT NULL ,
    roleDesc varchar(100) DEFAULT NULL,
    role varchar(100) DEFAULT NULL,
    PRIMARY KEY (roleId)
  );
  ```

  



* **用户-角色关联表设计**

  ```sql
  /*mysql insert sql*/
  CREATE TABLE `sys_user_role` (
    `userId` int(11) NOT NULL COMMENT '用户Id,联合主键',
    `roleId` int(11) NOT NULL COMMENT '角色Id，联合主键',
    PRIMARY KEY (`userId`,`roleId`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  ```

  ```sql
  /*postgresql insert sql*/
  CREATE TABLE sys_user_role (
    userId int NOT NULL,
    roleId int NOT NULL,
    PRIMARY KEY (userId,roleId)
  );
  ```

  

* **资源表设计**(包括用于前端路由控制的sys_menu和用于API控制的sys_operation)

  ```sql
  /*mysql insert sql*/
  CREATE TABLE `sys_menu` (
    `id` int(12) NOT NULL AUTO_INCREMENT COMMENT '菜单Id',
    `parentId` int(11) DEFAULT NULL COMMENT '上级Id',
    `menuName` varchar(100) DEFAULT NULL COMMENT '菜单名称',
    `menuIcon` varchar(30) DEFAULT NULL COMMENT '菜单图标',
    `menuUrl` varchar(100) DEFAULT NULL COMMENT '菜单链接',
    `menuType` varchar(10) DEFAULT NULL COMMENT '菜单类型',
    `menuOrder` varchar(10) DEFAULT NULL COMMENT '菜单排序',
    `menuStatus` varchar(10) DEFAULT NULL COMMENT '菜单状态',
    PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
  ```

  ```sql
  /*mysql insert sql*/
  CREATE TABLE `sys_operation` (
    `id` int(12) NOT NULL COMMENT '操作Id，主键',
    `desc` varchar(100) DEFAULT NULL COMMENT '操作描述',
    `name` varchar(100) DEFAULT NULL COMMENT '操作名称',
    `api` varchar(100) DEFAULT NULL COMMENT 'API名称',
    `url` varchar(100) DEFAULT NULL COMMENT '操作路径',
    PRIMARY KEY (`id`),
  ) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
  ```

  ```sql
  /*postgresql insert sql*/
  CREATE SEQUENCE sys_menu_id_seq;
  CREATE TABLE sys_menu (
    id int NOT NULL DEFAULT nextval('sys_menu_id_seq'),
    parentId int DEFAULT NULL,
    menuName varchar(100) DEFAULT NULL,
    menuIcon varchar(30) DEFAULT NULL,
    menuUrl varchar(100) DEFAULT NULL,
    menuType varchar(10) DEFAULT NULL,
    menuOrder varchar(10) DEFAULT NULL,
    menuStatus varchar(10) DEFAULT NULL,
    PRIMARY KEY (id)
  );
  ```

  ```sql
  /*postgresql insert sql*/
  CREATE SEQUENCE sys_operation_id_seq;
  CREATE TABLE sys_operation (
    id int NOT NULL DEFAULT nextval('sys_operation_id_seq'),
    name varchar(100) DEFAULT NULL,
    api varchar(100) DEFAULT NULL,
    url varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
  );
  ```

  

* 权限表设计

  ```sql
  CREATE TABLE `sys_role_permission` (
    `roleId` int(11) NOT NULL COMMENT '角色Id',
    `permissionId` int(11) NOT NULL COMMENT 'API权限Id',
    `permissionType` int(2) NOT NULL COMMENT '关联类型(0 菜单 1 API链接)',
    PRIMARY KEY (`roleId`,`permissionId`),
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
  ```

  

