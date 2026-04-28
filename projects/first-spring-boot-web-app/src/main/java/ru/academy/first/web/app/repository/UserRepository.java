package ru.academy.first.web.app.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import ru.academy.first.web.app.model.entity.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findByNameContainingIgnoreCase(String namePart);

    @Query("SELECT u FROM User u WHERE u.email LIKE %:domain")
    List<User> findAllByEmailDomain(@Param("domain") String domain);
}
