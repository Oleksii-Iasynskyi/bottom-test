# bottom-test

Steps for test run and viewing report:

1) clone repository;

2) execute following maven command from project directory - 

<b>mvn test -Dgmail.username={your username} -Dgmail.password={your password}</b>

where {your username} and {your password} - is your email credentials

3) after test is finished generate Allure report -

<b>mvn site</b>

report will be stored in the - bottom-test\target\site\allure-maven-plugin\

4) also you may execute -

<b>mvn jetty:run</b> - that will start server for viewing reports locally

after server is started open <b>http://localhost:8080</b> for viewing report
