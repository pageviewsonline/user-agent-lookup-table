package online.pageviews.useragentlookup;

/*
 * PageviewsOnline User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-08T12:54:31.726Z.
 */

public class UserAgentData {

    private final ClientFamily client;
    private final OperatingSystemFamily operatingSystem;

    public UserAgentData(ClientFamily client, OperatingSystemFamily operatingSystem) {
        this.client = client;
        this.operatingSystem = operatingSystem;
    }

    public ClientFamily getClient() {
      return this.client;
    }

    public OperatingSystemFamily getOperatingSystem() {
        return this.operatingSystem;
    }

    @Override
    public String toString() {
        return "[client=" + client.getName() + " os=" + operatingSystem.getName() + "]";
    }

}
