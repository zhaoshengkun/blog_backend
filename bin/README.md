backend

目前已实现的功能：
日志管理：暂定级别 INFO
日志文件存放位置 /log

权限管理：
	角色：admin,user
	加密：security自带的加密 PasswordEncoderUtil
	表结构：目前使用啦 sa_user_role(关联生成，不需要建立实体类),sa_role,sa_user_info
	

JPA: 已重写常用的方法
	使用时，先写一个接口（repository） ,在写一个class 继承 GenericRepositoryServiceImpl

工具类：GenEntityMysql 可以根据表结构生成实体类

框架： springboot 2.x 

数据库：mysql

连接池： 阿里 druid

测试权限管理：
	首先登陆 localhost:8088 ,会跳转到localhost:8088/index, 
	如果未登录 会提示登陆，会注册，(在sa_user_info 中有一个字段status，暂定分为 normal locked ,建议用tinyint ，用枚举类型)
	如果已登录会显示相关信息