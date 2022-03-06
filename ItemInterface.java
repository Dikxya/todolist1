package com.todo.App.repository;


import com.todo.App.entity.Item;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@RestController
public interface ItemInterface extends JpaRepository<Item,Integer> {

    @Configuration
    class RepositoryConfig implements RepositoryRestConfigurer{
        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
            config.exposeIdsFor(Item.class);
        }
    }
}
