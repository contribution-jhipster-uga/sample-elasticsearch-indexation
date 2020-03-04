package com.mycompany.myapp.service.mapper;
//<--! package -->

import com.mycompany.myapp.domain.*;
import com.mycompany.myapp.service.dto.PhotoDTO;
//<--! import -->

import org.mapstruct.*;

/**
 * Mapper for the entity {@link PhotoLite} and its DTO {@link PhotoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PhotoLiteMapper extends EntityMapper<PhotoDTO, PhotoLite> {

    //@Mapping(source = "user.id", target = "userId")
    PhotoDTO toDto(PhotoLite photoLite);

    //@Mapping(source = "userId", target = "user")
    PhotoLite toEntity(PhotoDTO photoDTO);

    default PhotoLite fromId(Long id) {
        if (id == null) {
            return null;
        }
        PhotoLite photoLite = new PhotoLite();
        photoLite.setId(id);
        return photoLite;
    }
}
