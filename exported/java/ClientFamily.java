package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-01-13T20:09:23.278Z.
 */

public enum ClientFamily {

    UNKNOWN(0, "unknown", "Unknown"),
    FIREFOX(1, "firefox", "Mozilla Firefox"),
    MICROSOFT_EDGE(2, "microsoft-edge", "Microsoft Edge"),
    CHROME(3, "chrome", "Google Chrome"),
    OPERA(4, "opera", "Opera"),
    SAFARI(5, "safari", "Safari"),
    BRAVE(6, "brave", "Brave"),
    YANDEX_BROWSER(7, "yandex-browser", "Yandex Browser"),
    MSHOTS_BOT(8, "mshots-bot", "MShots Bot"),
    GOOGLE_CRAWLER_BOT(9, "google-crawler-bot", "Google Crawler Bot"),
    DUCKDUCKGO_BOT(10, "duckduckgo-bot", "DuckDuckGo Bot"),
    NAVER_WHALE(11, "naver-whale", "Naver Whale Browser"),
    FACEBOOK_APP(12, "facebook-app", "Facebook App"),
    VALVE_STEAM_OVERLAY(13, "valve-steam-overlay", "Valve Steam Overlay"),
    WHALE_BROWSER(14, "whale-browser", "Whale Browser"),
    XIAOMI_MIUI_BROWSER(15, "xiaomi-miui-browser", "Xiaomi MIUI Browser"),
    SAMSUNG_BROWSER(16, "samsung-browser", "Samsung Browser"),
    ANDROID_WEBVIEW(17, "android-webview", "Android WebView"),
    SPEEDCURVE_BOT(18, "speedcurve-bot", "SpeedCurve Speedtester Bot"),
    BING_BOT(19, "bing-bot", "Microsoft Bing Bot"),
    IUBENDA_RADAR_BOT(20, "iubenda-radar-bot", "Iubenda Radar Bot"),
    BITSIGHT_BOT(21, "bitsight-bot", "BitSight Bot"),
    GOOGLE_SEARCH_APP(22, "google-search-app", "Google Search App"),
    BAIDU_SPIDER_BOT(23, "baidu-spider-bot", "Baidu Spider Bot"),
    INSTAGRAM_APP(24, "instagram-app", "Instagram App"),
    WEBKIT_BROWSER(25, "webkit-browser", "WebKit Browser"),
    SOGOU_WEB_SPIDER_BOT(26, "sogou-web-spider-bot", "Sogou Web Spider Bot"),
    WECHAT_APP(27, "wechat-app", "WeChat App"),
    TIKTOK_APP(28, "tiktok-app", "TikTok App"),
    VIVO_BROWSER(29, "vivo-browser", "Vivo Browser"),
    YANDEX_SEARCH_BOT(30, "yandex-search-bot", "Yandex Search Bot"),
    DATAPROVIDER_BOT(31, "dataprovider-bot", "Dataprovider.com Bot"),
    ELECTRON_WEBVIEW(32, "electron-webview", "Electron WebView"),
    SEBOT_WA_BOT(33, "sebot-wa-bot", "SEBot-WA"),
    OPERA_TOUCH(34, "opera-touch", "Opera Touch"),
    CHROME_HEADLESS(35, "chrome-headless", "Chrome (Headless)"),
    YAHOO_JAPAN_APP(36, "yahoo-japan-app", "Yahoo Japan App"),
    ABEVALBOT_BOT(37, "abevalbot-bot", "ABEvalBot"),
    META_QUEST_BROWSER(38, "meta-quest-browser", "Meta Quest Browser"),
    QUILLBOT_BOT(39, "quillbot-bot", "Quillbot Bot"),
    YISOUSPIDER_BOT(40, "yisouspider-bot", "YisouSpider Web Crawler Bot"),
    OPERA_GX(41, "opera-gx", "Opera GX"),
    NEWSAI_BOT(42, "newsai-bot", "NewsAI Bot"),
    ULTRALIGHT_APP(43, "ultralight-app", "Ultralight Photo Video Editor App"),
    INTERNET_EXPLORER(44, "internet-explorer", "Internet Explorer");

    public static ClientFamily create(int id) throws UnknownClientFamilyException {
       for (ClientFamily mode : ClientFamily.values()) {
           if (mode.id == id) {
               return mode;
           }
        }
        throw new UnknownClientFamilyException(id);
    }

    private final int id;
    private final String slug;
    private final String name;

    ClientFamily(int id, String slug, String name) {
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
