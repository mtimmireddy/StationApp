FROM tomcat:8.0-jre8 AS tomcatimage

ADD repopath/com/app/StationFinder/app-ws.war-version no.
ADD local.properties lib/
ADD server.xml /usr/local/tomcat/conf/server.xml
ADD .keystore /root/.keystore
