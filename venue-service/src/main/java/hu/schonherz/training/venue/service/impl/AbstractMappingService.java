package hu.schonherz.training.venue.service.impl;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.MappingException;

public abstract class AbstractMappingService implements Mapper {

    private final Mapper mapper = new DozerBeanMapper();

    private Mapper getMapper() {
        return mapper;
    }

    @Override
    public <T> T map(Object var1, Class<T> var2) throws MappingException {
        return getMapper().map(var1, var2);
    }

    @Override
    public void map(Object var1, Object var2) throws MappingException {
        getMapper().map(var1, var2);
    }

    @Override
    public <T> T map(Object var1, Class<T> var2, String var3) throws MappingException {
        return getMapper().map(var1, var2, var3);
    }

    @Override
    public void map(Object var1, Object var2, String var3) throws MappingException {
        getMapper().map(var1, var2, var3);
    }

}
