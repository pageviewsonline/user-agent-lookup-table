package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-18T09:15:18.675Z.
 */

public class UnknownClientFamilyException extends Exception {

    public UnknownClientFamilyException(int id) {
        super("Unknown client family \"" + id + "\".");
    }

}
