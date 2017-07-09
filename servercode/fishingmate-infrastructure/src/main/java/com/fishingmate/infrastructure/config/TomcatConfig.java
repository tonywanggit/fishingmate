/**
 * (C) Copyright 2016 Ymatou (http://www.ymatou.com/).
 *
 * All rights reserved.
 */
package com.fishingmate.infrastructure.config;

import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class TomcatConfig {

    private int port;
    private int connectionTimeout;
    private int maxConnections;
    private int maxThreads;
    private int acceptCount;
    private String uriEncoding;
    private String protocol;

    /**
     * @return the port
     */
    public int getPort() {
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        this.port = port;
    }

    /**
     * @return the connectionTimeout
     */
    public int getConnectionTimeout() {
        return connectionTimeout;
    }

    /**
     * @param connectionTimeout the connectionTimeout to set
     */
    public void setConnectionTimeout(int connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * @return the maxConnections
     */
    public int getMaxConnections() {
        return maxConnections;
    }

    /**
     * @param maxConnections the maxConnections to set
     */
    public void setMaxConnections(int maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * @return the maxThreads
     */
    public int getMaxThreads() {
        return maxThreads;
    }

    /**
     * @param maxThreads the maxThreads to set
     */
    public void setMaxThreads(int maxThreads) {
        this.maxThreads = maxThreads;
    }

    /**
     * @return the acceptCount
     */
    public int getAcceptCount() {
        return acceptCount;
    }

    /**
     * @param acceptCount the acceptCount to set
     */
    public void setAcceptCount(int acceptCount) {
        this.acceptCount = acceptCount;
    }

    /**
     * @return the uriEncoding
     */
    public String getUriEncoding() {
        return uriEncoding;
    }

    /**
     * @param uriEncoding the uriEncoding to set
     */
    public void setUriEncoding(String uriEncoding) {
        this.uriEncoding = uriEncoding;
    }

    /**
     * @return the protocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * @param protocol the protocol to set
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }


}
