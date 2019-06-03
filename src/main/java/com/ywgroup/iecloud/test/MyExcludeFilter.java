package com.ywgroup.iecloud.test;

import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @program: solarpower
 * @description:
 * @author: wxhai
 * @create: 2019-03-06 15:35
 **/
public class MyExcludeFilter implements TypeFilter {

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        if(metadataReader.getClassMetadata().getClassName().contains("ExcludeTest")){
            return true;
        }
        return false;
    }

}
