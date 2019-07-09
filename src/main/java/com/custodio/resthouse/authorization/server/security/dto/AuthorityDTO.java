package com.custodio.resthouse.authorization.server.security.dto;

import com.custodio.resthouse.authorization.server.security.model.Authority;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

/**
 * Data Transfer Object that represents a {@link Authority}.
 *
 * @author williamcustodio
 */
@Data
public class AuthorityDTO implements GrantedAuthority
{
    private Long id;

    private String authority;
}