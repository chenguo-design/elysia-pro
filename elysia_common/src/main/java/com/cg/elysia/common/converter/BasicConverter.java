package com.cg.elysia.common.converter;

import org.mapstruct.InheritConfiguration;

import java.util.List;

/**
 *
 * @param <S> source
 * @param <T> target
 */
public interface BasicConverter<S,T> {

    T toTarget(S s);

    @InheritConfiguration(name = "toTarget")
    List<T> toTargets(List<S> sList);


    S toSource(T t);

    @InheritConfiguration(name = "toSource")
    List<S> toSources(List<T> tList);
}
