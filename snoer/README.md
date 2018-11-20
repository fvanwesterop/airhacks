# Build
mvn clean package && docker build -t com.airhacks/snoer .

# RUN

docker rm -f snoer || true && docker run -d -p 8080:8080 -p 4848:4848 --name snoer com.airhacks/snoer 