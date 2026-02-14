package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-02-14T09:12:43.728Z.
 */

public enum ClientFamily {

    UNKNOWN(0, "unknown", "Unknown", ""),
    FIREFOX(1, "firefox", "Mozilla Firefox", "https://www.firefox.com/"),
    MICROSOFT_EDGE(2, "microsoft-edge", "Microsoft Edge", "https://www.microsoft.com/edge/"),
    CHROME(3, "chrome", "Google Chrome", "https://www.google.com/chrome/"),
    OPERA(4, "opera", "Opera", "https://www.opera.com/"),
    SAFARI(5, "safari", "Safari", "https://www.apple.com/safari/"),
    BRAVE(6, "brave", "Brave", "https://brave.com/"),
    YANDEX_BROWSER(7, "yandex-browser", "Yandex Browser", "https://browser.yandex.com/"),
    MSHOTS_BOT(8, "mshots-bot", "MShots Bot", ""),
    GOOGLE_CRAWLER_BOT(9, "google-crawler-bot", "Google Crawler Bot", "https://developers.google.com/search/docs/crawling-indexing/googlebot"),
    DUCKDUCKGO_BOT(10, "duckduckgo-bot", "DuckDuckGo Bot", "https://duckduckgo.com/duckduckgo-help-pages/results/duckduckbot"),
    NAVER_WHALE_BROWSER(11, "naver-whale-browser", "Naver Whale Browser", "https://whale.naver.com/"),
    FACEBOOK_APP(12, "facebook-app", "Facebook App", "https://www.facebook.com/"),
    VALVE_STEAM_OVERLAY(13, "valve-steam-overlay", "Valve Steam Overlay", "https://help.steampowered.com/en/faqs/view/3978-072C-18DF-FBF9"),
    OPENNEWS_APP(14, "opennews-app", "Open News App", ""),
    XIAOMI_MIUI_BROWSER(15, "xiaomi-miui-browser", "Xiaomi MIUI Browser", "https://trust.mi.com/docs/miui-privacy-white-paper-global/4/7"),
    SAMSUNG_BROWSER(16, "samsung-browser", "Samsung Browser", "https://browser.samsung.com/"),
    ANDROID_WEBVIEW(17, "android-webview", "Android WebView", "https://developer.android.com/reference/android/webkit/WebView"),
    SPEEDCURVE_BOT(18, "speedcurve-bot", "SpeedCurve Speedtester Bot", "https://pagevitals.com/"),
    BING_BOT(19, "bing-bot", "Microsoft Bing Bot", "https://www.microsoft.com/en-us/bing"),
    IUBENDA_RADAR_BOT(20, "iubenda-radar-bot", "Iubenda Radar Bot", "https://www.iubenda.com/"),
    BITSIGHT_BOT(21, "bitsight-bot", "BitSight Bot", "https://www.bitsight.com/"),
    GOOGLE_SEARCH_APP(22, "google-search-app", "Google Search App", "https://search.google/google-app/"),
    BAIDU_SPIDER_BOT(23, "baidu-spider-bot", "Baidu Spider Bot", "https://www.baidu.com/search/spider.htm"),
    INSTAGRAM_APP(24, "instagram-app", "Instagram App", "https://www.instagram.com/"),
    WEBKIT_BROWSER(25, "webkit-browser", "WebKit Browser", "https://webkit.org/"),
    SOGOU_WEB_SPIDER_BOT(26, "sogou-web-spider-bot", "Sogou Web Spider Bot", "https://www.sogou.com/"),
    WECHAT_APP(27, "wechat-app", "WeChat App", "https://www.wechat.com/"),
    TIKTOK_APP(28, "tiktok-app", "TikTok App", "https://www.tiktok.com/en/"),
    VIVO_BROWSER(29, "vivo-browser", "Vivo Browser", "https://www.vivo.com/"),
    YANDEX_SEARCH_BOT(30, "yandex-search-bot", "Yandex Search Bot", "https://yandex.com/"),
    DATAPROVIDER_BOT(31, "dataprovider-bot", "Dataprovider.com Bot", "https://www.dataprovider.com/"),
    ELECTRON_WEBVIEW(32, "electron-webview", "Electron WebView", "https://www.electronjs.org/"),
    SEBOT_WA_BOT(33, "sebot-wa-bot", "SEBot-WA", ""),
    OPERA_TOUCH(34, "opera-touch", "Opera Touch", "https://www.opera.com/mobile/touch"),
    CHROME_HEADLESS(35, "chrome-headless", "Chrome (Headless)", "https://developer.chrome.com/docs/chromium/headless"),
    YAHOO_JAPAN_APP(36, "yahoo-japan-app", "Yahoo Japan App", "https://promo-mobile.yahoo.co.jp/yjapp/"),
    ABEVALBOT_BOT(37, "abevalbot-bot", "ABEvalBot", ""),
    META_QUEST_BROWSER(38, "meta-quest-browser", "Meta Quest Browser", "https://www.meta.com/en-gb/experiences/browser/1916519981771802/"),
    QUILLBOT_BOT(39, "quillbot-bot", "Quillbot Bot", "https://quillbot.com/"),
    YISOUSPIDER_BOT(40, "yisouspider-bot", "YisouSpider Web Crawler Bot", "https://zhanzhang.sm.cn/"),
    OPERA_GX(41, "opera-gx", "Opera GX", "https://www.opera.com/gx/gx-browser"),
    NEWSAI_BOT(42, "newsai-bot", "NewsAI Bot", "https://www.newsai.me/"),
    ULTRALIGHT_APP(43, "ultralight-app", "Ultralight Photo Video Editor App", "https://www.ultralightapp.com/"),
    INTERNET_EXPLORER(44, "internet-explorer", "Internet Explorer", "https://support.microsoft.com/en-us/windows/internet-explorer-downloads-d49e1f0d-571c-9a7b-d97e-be248806ca70"),
    EXPO_RESEARCH_BOT(45, "expo-research-bot", "Expo React Native Bot", "https://www.expoaichatbot.com/"),
    DUCKDUCKGO_BROWSER(46, "duckduckgo-browser", "DuckDuckGo Browser", "https://duckduckgo.com/"),
    SNAPCHAT_APP(47, "snapchat-app", "Snapchat", "https://www.snapchat.com/"),
    SRWARE_IRON_BROWSER(48, "srware-iron-browser", "SRWare Iron Browser", "https://www.srware.net/iron/"),
    STREAMLABS_DESKTOP(49, "streamlabs-desktop", "Streamlabs Desktop", "https://streamlabs.com/"),
    GOOGLE_GEMINI_APP(50, "google-gemini-app", "Google Gemini App", "https://gemini.google.com/"),
    META_BROWSER(51, "meta-browser", "Meta Browser", "https://www.meta.com/");

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
    private final String url;

    ClientFamily(int id, String slug, String name, String url) {
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
