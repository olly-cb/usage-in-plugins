package org.jenkinsci.deprecatedusage;

import java.io.IOException;

public class HttpResponseException extends IOException {

    private static final long serialVersionUID = 1L;

    public HttpResponseException(int statusCode, String responseMessage) {
        super("HTTP " + statusCode + " " + responseMessage);
    }
}
