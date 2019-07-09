package com.custodio.resthouse.authorization.server.security.service;

import com.custodio.resthouse.authorization.server.security.mapper.UserMapper;
import com.custodio.resthouse.authorization.server.security.model.User;
import com.custodio.resthouse.authorization.server.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

/**
 * Service responsible for exposing processes related to a {@link User}.
 *
 * @author williamcustodio
 */
@Service
@Transactional
public class UserService implements UserDetailsService
{
    private final UserRepository userRepository;

    @Autowired
    public UserService(final UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(final String username)
    {
        final User user = this.userRepository.findByUsername(username);

        if (Objects.isNull(user))
        {
            throw new UsernameNotFoundException(username);
        }

        return UserMapper.INSTANCE.modelToDto(user);
    }
}