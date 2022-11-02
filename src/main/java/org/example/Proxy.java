public class Proxy {
    private String hostname;
    private Integer port;
    private String username;
    private String password;


    public Proxy() {
    }

    public Proxy(String hostname, Integer port, String username, String password) {
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public Proxy(Proxy proxy) {
    }


    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "hostname='" + hostname + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proxy)) return false;

        Proxy proxy = (Proxy) o;

        if (getHostname() != null ? !getHostname().equals(proxy.getHostname()) : proxy.getHostname() != null)
            return false;
        if (getPort() != null ? !getPort().equals(proxy.getPort()) : proxy.getPort() != null) return false;
        if (getUsername() != null ? !getUsername().equals(proxy.getUsername()) : proxy.getUsername() != null)
            return false;
        return getPassword() != null ? getPassword().equals(proxy.getPassword()) : proxy.getPassword() == null;
    }

    @Override
    public int hashCode() {
        int result = getHostname() != null ? getHostname().hashCode() : 0;
        result = 31 * result + (getPort() != null ? getPort().hashCode() : 0);
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }
}