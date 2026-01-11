package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-11T08:51:40.104Z.
 */

public enum OperatingSystemFamily {

    UNKNOWN(0, "unknown", "Unknown"),
    IOS(1, "ios", "iOS"),
    LINUX(2, "linux", "Linux"),
    ANDROID_FIRE_OS(3, "android-fire-os", "Amazon Fire OS"),
    WINDOWS(4, "windows", "Windows"),
    MACOS(5, "macos", "macOS"),
    LINUX_UBUNTU(6, "linux-ubuntu", "Ubuntu"),
    CHROME_OS(7, "chrome-os", "Chrome OS"),
    ANDROID(8, "android", "Android"),
    LINUX_ARCH(9, "linux-arch", "Arch Linux");

    public static OperatingSystemFamily create(int id) throws UnknownOperatingSystemException {
        for (OperatingSystemFamily mode : OperatingSystemFamily.values()) {
            if (mode.id == id) {
                return mode;
            }
        }
        throw new UnknownOperatingSystemException(id);
    }

    private final int id;
    private final String slug;
    private final String name;

    OperatingSystemFamily(int id, String slug, String name) {
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
