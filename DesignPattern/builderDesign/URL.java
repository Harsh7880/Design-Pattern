package designPattern.builderDesign;

public class URL {

    private String protocol;
    private String hostName;
    private String port;
    private String pathParams;
    private String queryParams;

    public URL(){

    }
    
    public URL(String protocol){
        this.protocol = protocol;
    }

    public URL(String protocol,String hostName){
        this.protocol = protocol;
        this.hostName = hostName;
    }

    public URL(String protocol,String hostName,String port){
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
    }

    public URL(String protocol,String hostName,String port,String pathParams){
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
        this.pathParams = pathParams;
    }

    public URL(String protocol,String hostName,String port,String pathParams,String queryParams){
        this.protocol = protocol;
        this.hostName = hostName;
        this.port = port;
        this.pathParams = pathParams;
        this.queryParams = queryParams;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHostName() {
        return hostName;
    }

    public String getPort() {
        return port;
    }

    public String getPathParams() {
        return pathParams;
    }

    public String getQueryParams() {
        return queryParams;
    }
    
}
