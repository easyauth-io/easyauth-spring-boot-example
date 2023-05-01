# Spring boot application authentication using EasyAuth

1. Sign in to [easyauth.io](https://easyauth.io) and create a new 'Registered Client' with redirect URI set to `http://127.0.0.1:8080/login/oauth2/code/easyauth`

2. Clone the sample app from [https://github.com/easyauth-io/easyauth-spring-boot-example](https://github.com/easyauth-io/easyauth-spring-boot-example)

    `git clone git@github.com:easyauth-io/easyauth-spring-boot-example.git`

3. Open the project in your favourite editor. 

4. Edit the `src/main/resources/application.properties` file and set the values from your 'Registered Client' that you created in step 1 in place of the curly braces - {}.

5. Run the project and visit [http://127.0.0.1:8080](http://127.0.0.1:8080)
