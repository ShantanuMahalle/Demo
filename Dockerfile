


# Use the official Java 8 image as the base
FROM openjdk:8-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the Java source file into the container
COPY Abc.java /app/

# Compile the Java program
RUN javac Abc.java

# Run the Java program
CMD ["java", "Abc"]