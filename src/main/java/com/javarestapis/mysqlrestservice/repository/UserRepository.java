package com.javarestapis.mysqlrestservice.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.javarestapis.mysqlrestservice.entity.UserApi;

//@RepositoryRestResource(path = "/users")
@RepositoryRestResource(exported = false)
public interface UserRepository extends JpaRepository<UserApi, String> {
    //This is a magical interface which provides all the CRUD implementations.
}
