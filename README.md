# Spring-Boot-Starter-Paypal
Integrate Paypal Service with Spring Boot

#### Clone & Install PayPal Service

- Clone & Instsall this to local maven repo: https://github.com/phuongtailtranminh/Paypal-Service

#### Clone & Install Spring Boot Starter Paypal (this repo) to local maven

### Add necessary information to application.properties file

spring.paypal.client-id=ARDE-_CQ9EOws0_72NG3B5qiO6xWGTPKPUj2LojU0XnrJdahfaJsJEIGX89nzLOTojFrkL0Clp70uTjb
spring.paypal.client-secret=EJogeWqcaaT4Ye2cAALhaNWN_FZ1X8l4hlMsSp49ARIXlbg_hHU9qOtSYpMJ5KsnMnRqlArAgfccp0YG
spring.paypal.mode=sandbox

#### Add dependency to your Spring Boot project

		<dependency>
			<groupId>me.phuongtm</groupId>
			<artifactId>spring-boot-starter-paypal</artifactId>
			<version>1.0-SNAPSHOT</version>
		</dependency>
    
#### Use PaypalService bean

    @Autowired
    private PaypalService service;
    
   
