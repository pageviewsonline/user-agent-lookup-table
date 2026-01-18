package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-18T13:20:01.329Z.
 */

public enum OperatingSystemFamily {

    UNKNOWN(0, "unknown", "Unknown", ""),
    IOS(1, "ios", "iOS", "https://www.apple.com/os/ios/"),
    LINUX(2, "linux", "Linux", "https://kernel.org/"),
    ANDROID_FIRE_OS(3, "android-fire-os", "Amazon Fire OS", "https://developer.amazon.com/docs/fire-tv/fire-os-overview.html"),
    WINDOWS(4, "windows", "Windows", "https://www.microsoft.com/en-us/windows"),
    MACOS(5, "macos", "macOS", "https://www.apple.com/os/macos/"),
    LINUX_UBUNTU(6, "linux-ubuntu", "Ubuntu", "https://ubuntu.com/"),
    CHROME_OS(7, "chrome-os", "Chrome OS", "https://chromeos.google/"),
    ANDROID(8, "android", "Android", "https://www.android.com/"),
    LINUX_ARCH(9, "linux-arch", "Arch Linux", "https://archlinux.org/");

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
    private final String url;

    OperatingSystemFamily(int id, String slug, String name, String url) {
        this.id = id;
        this.slug = slug;
        this.name = name;
        this.url = url;
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

    public String getURL() {
        return this.url;
    }

}
