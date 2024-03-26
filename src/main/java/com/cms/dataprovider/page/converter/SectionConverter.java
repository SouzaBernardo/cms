package com.cms.dataprovider.page.converter;

import com.cms.core.domain.SectionDTO;
import com.cms.dataprovider.base.EntityConverter;
import com.cms.dataprovider.page.domain.SectionEntity;
import org.mapstruct.Mapper;

@Mapper
public interface SectionConverter extends EntityConverter<SectionEntity, SectionDTO> {
}
