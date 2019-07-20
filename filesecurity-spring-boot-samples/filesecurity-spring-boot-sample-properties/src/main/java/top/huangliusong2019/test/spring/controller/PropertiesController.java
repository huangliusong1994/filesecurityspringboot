package top.huangliusong2019.test.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.huangliusong1994.spring.PropEntity;
import top.huangliusong2019.spring.annotation.FileSecurityAnnotation;
import top.huangliusong2019.spring.autoconfigure.FileSecurityProperties;

/**
 * Test FileSecurityProperties
 *
 * @author huangliusong
 * @since 2019/7/20
 * {@link FileSecurityProperties}
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/v1")
public class PropertiesController {

    private Logger logger = LoggerFactory.getLogger(FileSecurityAnnotation.class);

    @Autowired
    private FileSecurityProperties properties;


    @GetMapping(value = "/prop")
    @ResponseBody
    public PropEntity prop() {
        PropEntity propEntity = new PropEntity();
        logger.info("properties={}", properties);
        BeanUtils.copyProperties(properties, propEntity);
        logger.info("propEntity={}", propEntity);
        return propEntity;
    }
}
