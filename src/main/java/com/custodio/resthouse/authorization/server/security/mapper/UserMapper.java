package com.custodio.resthouse.authorization.server.security.mapper;

import com.custodio.resthouse.authorization.server.security.dto.UserDTO;
import com.custodio.resthouse.authorization.server.security.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper responsible for handling conversion processes related to a {@link User}.
 *
 * @author williamcustodio
 */
@Mapper(uses = AuthorityMapper.class)
public interface UserMapper
{
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    /**
     * Convert a {@link User} into a {@link UserDTO}.
     *
     * @param user The object to be converted.
     * @return The object containing the converted data.
     */
    UserDTO modelToDto(User user);
}