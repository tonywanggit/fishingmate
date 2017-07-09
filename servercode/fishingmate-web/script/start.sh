#!/bin/bash
GCLOGPATH="logs/gc.log"
APP_NAME="fishingmate.5151pic.com"
MAIN_CLASS="com.fishingmate.web.Application"
CLASS_PATH="lib/*:conf"
JAVA_OPTS=" -server \
            -Xms200m -Xmx500m \
            -XX:+PrintGCDateStamps -verbose:gc -XX:+PrintGCDetails -Xloggc:/usr/local/log/${APP_NAME}/gc.log \
            -XX:+UseGCLogFileRotation -XX:NumberOfGCLogFiles=10 -XX:GCLogFileSize=100M \
            -Dsun.net.inetaddr.ttl=60 \
            -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=/usr/local/log/${APP_NAME}/heapdump.hprof"

#############intial work##########################
#cd /usr/local/fishingmate
if [ -e "logs" ]; then
    rm -rf logs
fi
ln -s /usr/local/log/${APP_NAME}/ logs

##############launch the service##################
nohup java ${JAVA_OPTS} -cp ${CLASS_PATH} ${MAIN_CLASS} >> ${GCLOGPATH} 2>&1 &

##############check the service####################
ps aux | grep ${MAIN_CLASS} | grep -v grep > /dev/null 2>&1
if [ $? -eq 0 ]; then
    exit 0
else
    exit 1
fi
