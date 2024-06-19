FROM openjdk
WORKDIR target
COPY . .
CMD ["java", "-cp Main"]
