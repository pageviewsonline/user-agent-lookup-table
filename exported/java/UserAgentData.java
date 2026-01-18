package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-18T13:01:47.762Z.
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
