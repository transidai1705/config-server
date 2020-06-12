package opt.sd.config.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * The security configuration to enable ENCRYPT/DECRYPT endpoint
 * 
 * @author tsdai
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
 
    @Override
    public void configure(HttpSecurity http) throws Exception {
    	// disable the CSRF for encrypt & decypt
        http.csrf()
          .ignoringAntMatchers("/encrypt/**")
          .ignoringAntMatchers("/decrypt/**");
 
        super.configure(http);
    }
}
