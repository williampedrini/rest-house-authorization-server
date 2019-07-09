package com.custodio.resthouse.authorization.server.security.repository;

import com.custodio.resthouse.authorization.server.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * An {@link User} Data Access Object.
 *
 * @author williamcustodio
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
    /**
     * Search for a certain {@link User} by their identifier.
     *
     * @param username The identifier used to perform the search.
     * @return The found user if exists or {@code null} if it does not.
     */
    User findByUsername(String username);
}