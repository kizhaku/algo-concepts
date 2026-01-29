package com.kizhaku.learn.scribble.httpserver;

import java.util.Map;

public class HttpRequest {
    private final String path;
    private final Map<String, String> header;
    private final byte[] body;

    public HttpRequest(String path, Map<String, String> header) {
        this.path = path;
        this.header = header;
        this.body = new byte[0];
    }

    public HttpRequest(String path, Map<String, String> header, byte[] body) {
        this.path = path;
        this.header = header;
        this.body = body;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public byte[] getBody() {
        return body;
    }
}
