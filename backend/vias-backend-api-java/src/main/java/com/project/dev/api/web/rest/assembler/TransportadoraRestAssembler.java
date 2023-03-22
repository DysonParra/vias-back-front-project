/*
 * @fileoverview    {TransportadoraRestAssembler}
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.api.web.rest.assembler;

import com.project.dev.api.dto.TransportadoraDTO;
import com.project.dev.api.web.rest.TransportadoraRest;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * TODO: Definición de {@code TransportadoraRestAssembler}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Component
public class TransportadoraRestAssembler implements RepresentationModelAssembler<TransportadoraDTO, EntityModel<TransportadoraDTO>> {

    /**
     * Convierte un DTO en un modelo.
     *
     * @param entityDTO DTO a convertir.
     * @return el modelo correspondiente al DTO:
     */
    @Override
    public EntityModel<TransportadoraDTO> toModel(TransportadoraDTO entityDTO) {
        return new EntityModel<>(entityDTO,
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(TransportadoraRest.class).getEntity(String.valueOf(entityDTO.getStrNombre()))).withSelfRel(),
                WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(TransportadoraRest.class).getAllEntities()).withRel("Transportadora"));
    }
}
