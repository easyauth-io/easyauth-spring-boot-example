# Spring boot application authentication using EasyAuth

1. Sign in to [easyauth.io](https://easyauth.io) and create a new 'Registered Client' with redirect URI set to `http://127.0.0.1:8080/login/oauth2/code/easyauth`

2. Clone the sample app from [https://github.com/easyauth-io/easyauth-spring-boot-example](https://github.com/easyauth-io/easyauth-spring-boot-example)

    `git clone git@github.com:easyauth-io/easyauth-spring-boot-example.git`

3. Open the project in IntelliJ idea

4. Edit the `src/main/resources/application.properties file` and set the values from your 'Registered Client' that you created in step1 excluding the curly braces-{}.

5. Also edit `line 27 & 28` of `src/main/java/com/easyauth/easyAuthExample/controller/UserRestController.java` providing the correct values excluding curly braces-{}.

6. Run the project and visit [http://127.0.0.1:8080](http://127.0.0.1:8080)
