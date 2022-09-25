package com.keymamo.projectboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Optional;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    /**
     * Auditing을 위해 필요(누가 수정을 했는가?
      * @return
     */
    @Bean
    public AuditorAware<String> auditorAware() {
        return () -> Optional.of("brand13");
    }
}
