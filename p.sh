#!/bin/sh
gradle clean distTar
scp build/distributions/pms3003-1.1-SNAPSHOT.tar pi@192.168.1.225:/home/pi/
