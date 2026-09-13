package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-09-13T08:29:55.311Z.
 */

public enum ClientFamilyType {

    UNKNOWN(0, "unknown", "Unknown"),
    APP(1, "app", "App"),
    BOT(2, "bot", "Bot"),
    WEBVIEW(3, "webview", "WebView"),
    BROWSER(4, "browser", "Browser");

    public static ClientFamilyType create(int id) throws UnknownClientFamilyTypeException {
        for (ClientFamilyType mode : ClientFamilyType.values()) {
            if (mode.id == id) {
                return mode;
            }
        }
        throw new UnknownClientFamilyTypeException(id);
    }

    private final int id;
    private final String slug;
    private final String name;

    ClientFamilyType(int id, String slug, String name) {
        this.id = id;
        this.slug = slug;
        this.name = name;
    }

    public int getID() {
        return this.id;
    }

    public String getSlug() {
        return this.slug;
    }

    public String getName() {
        return this.name;
    }

}
