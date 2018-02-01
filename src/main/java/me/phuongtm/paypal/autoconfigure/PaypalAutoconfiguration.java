package me.phuongtm.paypal.autoconfigure;

import me.phuongtm.paypalex.PaypalService;
import me.phuongtm.paypalex.configs.PaypalConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PaypalProperties.class)
public class PaypalAutoconfiguration {

    @Autowired
    private PaypalProperties prop;

    @Bean
    @ConditionalOnMissingBean
    public PaypalConfig paypalConfig() {
        if (prop.getClientId() == null) {
            throw new IllegalArgumentException("Client ID (spring.paypal.clientId) should be set in application.properties file");
        }
        if (prop.getClientSecret() == null) {
            throw new IllegalArgumentException("Client Secret (spring.paypal.clientSecret) should be set in application.properties file");
        }
        if (prop.getMode() == null) {
            throw new IllegalArgumentException("Mode (spring.paypal.mode) should be set in application.properties file");
        }
        PaypalConfig config = new PaypalConfig(prop.getClientId(), prop.getClientSecret(), prop.getMode());
        return config;
    }

    @Bean
    @ConditionalOnMissingBean
    public PaypalService paypalService(PaypalConfig config) {
        return new PaypalService(config);
    }

}
