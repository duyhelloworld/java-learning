public class ThymleafConfig {
    private int resolverOrder;
    private boolean cache;
    private String prefix;
    private String suffix;

    public int getResolverOrder() {
        return this.resolverOrder;
    }

    public void setResolverOrder(int resolverOrder) {
        this.resolverOrder = resolverOrder;
    }

    public boolean isCache() {
        return this.cache;
    }

    public boolean getCache() {
        return this.cache;
    }

    public void setCache(boolean cache) {
        this.cache = cache;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }


    @Override
    public String toString() {
        return "{" +
            " resolverOrder='" + getResolverOrder() + "'" +
            ", cache='" + isCache() + "'" +
            ", prefix='" + getPrefix() + "'" +
            ", suffix='" + getSuffix() + "'" +
            "}";
    }


}
