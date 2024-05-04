package designPattern.builderDesign;

/**
 * URLBuilder
 */
public class URLBuilder {

    public final String protocol;
    public final String hostName;
    public final String port;
    public final String pathParams;
    public final String queryParams;

    public URLBuilder (Builder builder){

        this.protocol = builder.protocol;
        this.hostName = builder.hostName;
        this.port = builder.port;
        this.pathParams = builder.pathParams;
        this.queryParams = builder.queryParams;
    }

    public static class  Builder {
    
        private String protocol;
        private String hostName;
        private String port;
        private String pathParams;
        private String queryParams;

        public Builder hostName(String hostName){
            this.hostName = hostName;
            return this;
        }
        public Builder protocol(String protocol){
            this.protocol = protocol;
            return this;
        }
        public Builder port(String port){
            this.port = port;
            return this;
        }
        public Builder pathParams(String pathParams){
            this.pathParams = pathParams;
            return this;
        }
        public Builder queryParams(String queryParams){
            this.queryParams = queryParams;
            return this;
        }

        public URLBuilder build() {
            return new URLBuilder(this);
        }
    }
}