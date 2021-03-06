package LifeStats.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by David Franzel on 4/27/2017.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"LifeStats.domain"})
@EnableJpaRepositories(basePackages = {"LifeStats.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
