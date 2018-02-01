package me.phuongtm.paypal.autoconfigure;

import me.phuongtm.paypalex.enums.PaypalMode;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.paypal")
public class PaypalProperties {

    private String clientId;
    private String clientSecret;
    private PaypalMode mode;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public PaypalMode getMode() {
        return mode;
    }

    public void setMode(PaypalMode mode) {
        this.mode = mode;
    }

}
