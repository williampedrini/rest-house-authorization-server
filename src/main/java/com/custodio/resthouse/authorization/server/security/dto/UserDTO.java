package com.custodio.resthouse.authorization.server.security.dto;

import com.custodio.resthouse.authorization.server.security.model.User;
import lombok.Data;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * Data Transfer Object that represents a {@link User}.
 *
 * @author williamcustodio
 */
@Data
public class UserDTO implements UserDetails
{
    private Long id;

    private String username;

    private String password;

    private boolean accountExpired;

    private boolean accountLocked;

    private boolean credentialsExpired;

    private boolean enabled;

    private List<AuthorityDTO> authorities;

    @Override
    public boolean isAccountNonExpired()
    {
        return !this.accountExpired;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return !this.accountLocked;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return !this.credentialsExpired;
    }
}