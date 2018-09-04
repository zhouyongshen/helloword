#!/usr/bin/env bash
#将jar移动到当前目录 避免重建时影响程序的运行
mv target/helloword-0.0.1-SNAPSHOT.jar ./
#TODO 停止已启动的服务

#启动服务 并后台挂起执行
nohup java -jar helloword-0.0.1-SNAPSHOT.jar >>log.log &
