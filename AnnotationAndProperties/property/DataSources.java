public class DataSources {
    private String username;
    private String url;
    private String password;

    public DataSources() {
    };

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", url='" + getUrl() + "'" +
            ", password='" + getPassword().length() + "'" +
            "}";
    }    
}
