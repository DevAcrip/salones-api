package co.unicauca.sirs.salones.controller.mapper;

import co.unicauca.sirs.salones.controller.request.SalonRequestDTO;
import co.unicauca.sirs.salones.entity.SalonEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-12T22:42:16-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8.1 (Amazon.com Inc.)"
)
@Component
public class SalonMapperImpl implements SalonMapper {

    @Override
    public SalonDTO toDto(SalonEntity salonEntity) {
        if ( salonEntity == null ) {
            return null;
        }

        Integer id = null;
        String name = null;
        Integer capacity = null;

        if ( salonEntity.getId() != null ) {
            id = salonEntity.getId().intValue();
        }
        name = salonEntity.getName();
        capacity = salonEntity.getCapacity();

        boolean isActive = false;

        SalonDTO salonDTO = new SalonDTO( id, name, capacity, isActive );

        return salonDTO;
    }

    @Override
    public SalonEntity toEntity(SalonDTO salonDto) {
        if ( salonDto == null ) {
            return null;
        }

        SalonEntity salonEntity = new SalonEntity();

        if ( salonDto.id() != null ) {
            salonEntity.setId( salonDto.id().longValue() );
        }
        salonEntity.setName( salonDto.name() );
        if ( salonDto.capacity() != null ) {
            salonEntity.setCapacity( salonDto.capacity() );
        }

        return salonEntity;
    }

    @Override
    public SalonEntity toEntity(SalonRequestDTO salonRequestDTO) {
        if ( salonRequestDTO == null ) {
            return null;
        }

        SalonEntity salonEntity = new SalonEntity();

        salonEntity.setName( salonRequestDTO.name() );
        if ( salonRequestDTO.capacity() != null ) {
            salonEntity.setCapacity( salonRequestDTO.capacity() );
        }

        return salonEntity;
    }

    @Override
    public List<SalonDTO> toDtos(List<SalonEntity> salonEntities) {
        if ( salonEntities == null ) {
            return null;
        }

        List<SalonDTO> list = new ArrayList<SalonDTO>( salonEntities.size() );
        for ( SalonEntity salonEntity : salonEntities ) {
            list.add( toDto( salonEntity ) );
        }

        return list;
    }
}
