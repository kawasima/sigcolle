#!/bin/sh

export PORT=3000
export DB_URL=jdbc:h2:~/sigcolle-db

java -cp dist/sigcolle-0.1.0-SNAPSHOT.jar:lib/* net.unit8.sigcolle.Main
