FROM bitnami/tomcat
WORKDIR /papa/
COPY . /papa
COPY addressbk.war /opt/bitnami/tomcat/webapps_default/addressbook.war
