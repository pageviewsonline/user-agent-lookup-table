package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-04-03T08:02:59.686Z.
 */

public class UnknownClientFamilyException extends Exception {

    public UnknownClientFamilyException(int id) {
        super("Unknown client family \"" + id + "\".");
    }

}
