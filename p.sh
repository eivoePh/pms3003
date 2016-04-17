#!/bin/sh
gradle clean distTar
scp build/distributions/pms3003-1.0-SNAPSHOT.tar pi@192.168.1.170:/home/jhl/
