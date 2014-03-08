si-spring-websockets
====================

Sample application demoing Spring Websocket support


This is a simple application that uses Spring 4 websockets support to show real time quake information across the world.

The data is sourced from USGS Earthquake hazard program. Spring Integration is used for polling for this information and
storing this in RabbitMQ.

Spring WebSockets support with STOMP protocol integrating with RabbitMQ is used for showing realtime information on UI.

Spring Boot is used for packaging the entire application
