package com.gl.springconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */

@RestController
@RefreshScope
public class MainController {

    @Value("${channel.source: No Channel}")
    private String source;

    @Autowired
    private ConfigProps configProps;

    @GetMapping("/info")
    public ChannelInfo getChannleInfo(){
        return new ChannelInfo(source, configProps.getName(), configProps.getUrl());
    }
}
