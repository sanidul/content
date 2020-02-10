docker rm -f content
docker rmi com.dock/content
call gradlew clean build
call docker build --build-arg JAR_FILE=build/libs/*.jar -t com.dock/content .
call docker run -d -p 8081:8081 --network composenetwork --name content com.dock/content
pause