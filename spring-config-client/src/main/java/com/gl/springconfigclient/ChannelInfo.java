package com.gl.springconfigclient;

/**
 * @author - GreenLearner(https://www.youtube.com/channel/UCaH2MTg94hrJZTolW01a3ZA)
 */
public class ChannelInfo {
    private String source;

    private String name;

    private String url;

    public ChannelInfo(String source, String name, String url) {
        this.source = source;
        this.name = name;
        this.url = url;
    }

    public ChannelInfo() {
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
