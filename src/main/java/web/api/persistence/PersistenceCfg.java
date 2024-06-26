package web.api.persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import web.api.persistence.repositories.InMemoryUserRepositoryImpl;
import web.api.persistence.storage.UserStorage;
import web.api.usecases.user.repositiries.InMemoryUserRepository;

@Configuration
public class PersistenceCfg {
    
    @Bean
    UserStorage getUserStorage() {
        return new UserStorage();
    }

    @Bean
    InMemoryUserRepository getRepository(UserStorage storage) {
        return new InMemoryUserRepositoryImpl(storage);
    }
}
