# crazywolf-logback

## 验证logback
### 使用说明
`log.debug("test memery usage" + i);`<br/>
之前加入判断当前是需要输出debug日志的判断，和不加判断系统内存占用大小的测试<br/>
`if (log.isDebugEnabled())` <br/>
### 校验方法
使用`jps` 命令 查看进程号<br/>
然后运行  `jmap -histo pid`  查看内存占用<br/>
或者使用 `jvisualvm.exe`查看内存变化<br/>
