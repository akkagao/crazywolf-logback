# crazywolf-logback
验证logback

log.debug("adsfadsfasdf" + i);
之前加入判断当前是需要输出debug日志的判断，和不加判断系统内存占用大小的测试
if (log.isDebugEnabled()) 

使用jps 查看进程号
然后运行  jmap -histo pid  查看内存占用，或者使用·jvisualvm.exe·查看内存变化
