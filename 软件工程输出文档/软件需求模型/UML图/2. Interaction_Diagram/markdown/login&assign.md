# Login&assign
![login&assign.png](./png/login&assign.png)
## 说明
> 类说明：
>+ 外部执行者：User，未知身份
>+ <<boundary\>> LoginUI：登录界面
>+ <<boundary\>> AssignUI：注册界面
>+ <<control\>> LoginManager：登录管理
>+ <<control\>> AssingManager：注册管理
>+ <<entity\>> UserLibrary：用户数据库，可能保存账号密码，用户身份，和对应的个人信息库的位置

> 消息说明：
>+ goto：用户访问网站
>+ showLogin：显示登录界面
>+ NewUser：新用户
>+ showAssign：显示注册界面
>+ AssignInfo：注册信息
>+ AssingRequest：注册请求
>+ AssignCheck：注册信息检查
>+ AssignInvalid：注册信息不合法
>+ AssignFailed：注册失败
>+ AssignValid：注册信息合法
>+ AssignSuccess：注册成功
>+ LoginInfo：登录信息
>+ LoginRequest：登录请求
>+ LoginCheck：身份验证
>+ LoginInvalid：验证不通过
>+ LoginFailed：登录失败
>+ LoginValid：验证通过
>+ LoginSuccess：登录成功
>+ showStudentHome：显示学生主页
>+ showTeacherHome：显示老师主页