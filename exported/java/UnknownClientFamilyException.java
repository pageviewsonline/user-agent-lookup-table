package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-18T13:01:47.761Z.
 */

public class UnknownClientFamilyException extends Exception {

    public UnknownClientFamilyException(int id) {
        super("Unknown client family \"" + id + "\".");
    }

}
