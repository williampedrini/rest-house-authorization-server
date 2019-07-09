package com.custodio.resthouse.authorization.server.security.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * Represents an authority that will give to an {@link User} a specific permission to access a certain resource.
 *
 * @author williamcustodio
 */
@Data
@Entity
@Table(name = "AUTHORITY", uniqueConstraints = @UniqueConstraint(columnNames = "NAME", name = "AUTHORITY_NAME_FK"))
public class Authority implements GrantedAuthority
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String authority;
}