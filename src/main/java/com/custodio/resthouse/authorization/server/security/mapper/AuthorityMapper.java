package com.custodio.resthouse.authorization.server.security.mapper;

import com.custodio.resthouse.authorization.server.security.dto.AuthorityDTO;
import com.custodio.resthouse.authorization.server.security.model.Authority;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Mapper responsible for handling conversion processes related to a {@link Authority}.
 *
 * @author williamcustodio
 */
@Mapper
public interface AuthorityMapper
{
    AuthorityMapper INSTANCE = Mappers.getMapper(AuthorityMapper.class);

    /**
     * Convert a {@link Authority} into a {@link AuthorityDTO}.
     *
     * @param user The object to be converted.
     * @return The object containing the converted data.
     */
    AuthorityDTO modelToDto(Authority user);
}