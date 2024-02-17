1. Start Localstack
2. Create parameter:

```console
$ awslocal ssm put-parameter --name "/config/app/some-message" --value "parameter-value" --type String --tags "Key=tag-key,Value=tag-value"
```

3. Build application:

```console
$ ./gradlew build
```

4. Run application

```console
$ java -jar build/libs/spring-cloud-aws-gh-2005-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev
```
