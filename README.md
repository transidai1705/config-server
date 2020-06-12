### Read Me First
- Config values are included in **.properties** / **.yml** format.
- Config file will be fetched from GIT repo at: [application-config](https://github.com/transidai1705/application-config.git)

### Getting Started

##### Reference Documentation
- [Spring Cloud Config](https://spring.io/projects/spring-cloud-config)
- [Baeldung](https://www.baeldung.com/spring-cloud-configuration)

##### Guides
- **config-server.jks**: encrypt key file (use for ASYMMETRIC CRYPTOGRAPHY)

###### How to generate: 

``` 
keytool -genkeypair -alias config-server-key \
        -keyalg RSA \ 
        -dname "CN=Application Cloud Config,OU=Unit,O=OPTSD,L=HCM,S=HCM,C=VN" \
        -keypass optsd1705_secret -keystore config-server.jks -storepass optsd1705_pass

```