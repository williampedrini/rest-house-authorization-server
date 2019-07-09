package com.custodio.resthouse.authorization.server.security.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Represents an user who will be granted to access specifics resource servers.
 *
 * @author williamcustodio
 */
@Data
@Entity
@Table(name = "USER_", uniqueConstraints = @UniqueConstraint(columnNames = "USER_NAME", name = "USER_USER_NAME_UK"))
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ACCOUNT_EXPIRED")
    private boolean accountExpired;

    @Column(name = "ACCOUNT_LOCKED")
    private boolean accountLocked;

    @Column(name = "CREDENTIALS_EXPIRED")
    private boolean credentialsExpired;

    @Column(name = "ENABLED")
    private boolean enabled;

    @ManyToMany
    @JoinTable(
            name = "USER_AUTHORITY",
            joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID")
    )
    private List<Authority> authorities;
}