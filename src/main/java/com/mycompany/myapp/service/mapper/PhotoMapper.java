package com.mycompany.myapp.service.mapper;
//<--! package -->

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.PhotoDTO;
//<--! import -->

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Photo} and its DTO {@link PhotoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PhotoMapper extends EntityMapper<PhotoDTO, Photo> {

    //@Mapping(source = "user.id", target = "userId")
    PhotoDTO toDto(Photo photo);

    //@Mapping(source = "userId", target = "user")
    Photo toEntity(PhotoDTO photoDTO);

    default Photo fromId(Long id) {
        if (id == null) {
            return null;
        }
        Photo photo = new Photo();
        photo.setId(id);
        return photo;
    }
}
