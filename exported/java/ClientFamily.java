package online.pageviews.useragentlookup;

/*
 * PageviewsOnline Site Analytics User Agent Lookup Table
 * https://github.com/pageviewsonline/user-agent-lookup-table/
 *
 * Generated 2026-09-13T08:29:55.310Z.
 */

public enum ClientFamily {

    UNKNOWN(0, "unknown", ClientFamilyType.UNKNOWN, "Unknown", ""),
    FIREFOX(1, "firefox", ClientFamilyType.BROWSER, "Mozilla Firefox", "https://www.firefox.com/"),
    MICROSOFT_EDGE(2, "microsoft-edge", ClientFamilyType.BROWSER, "Microsoft Edge", "https://www.microsoft.com/edge/"),
    CHROME(3, "chrome", ClientFamilyType.BROWSER, "Google Chrome", "https://www.google.com/chrome/"),
    OPERA(4, "opera", ClientFamilyType.BROWSER, "Opera", "https://www.opera.com/"),
    SAFARI(5, "safari", ClientFamilyType.BROWSER, "Safari", "https://www.apple.com/safari/"),
    BRAVE(6, "brave", ClientFamilyType.BROWSER, "Brave", "https://brave.com/"),
    YANDEX_BROWSER(7, "yandex-browser", ClientFamilyType.BROWSER, "Yandex Browser", "https://browser.yandex.com/"),
    MSHOTS_BOT(8, "mshots-bot", ClientFamilyType.BOT, "MShots Bot", ""),
    GOOGLE_CRAWLER_BOT(9, "google-crawler-bot", ClientFamilyType.BOT, "Google Crawler Bot", "https://developers.google.com/search/docs/crawling-indexing/googlebot"),
    DUCKDUCKGO_BOT(10, "duckduckgo-bot", ClientFamilyType.BOT, "DuckDuckGo Bot", "https://duckduckgo.com/duckduckgo-help-pages/results/duckduckbot"),
    NAVER_WHALE_BROWSER(11, "naver-whale-browser", ClientFamilyType.BROWSER, "Naver Whale Browser", "https://whale.naver.com/"),
    FACEBOOK_APP(12, "facebook-app", ClientFamilyType.APP, "Facebook App", "https://www.facebook.com/"),
    VALVE_STEAM_OVERLAY(13, "valve-steam-overlay", ClientFamilyType.APP, "Valve Steam Overlay", "https://help.steampowered.com/en/faqs/view/3978-072C-18DF-FBF9"),
    OPENNEWS_APP(14, "opennews-app", ClientFamilyType.APP, "Open News App", ""),
    XIAOMI_MIUI_BROWSER(15, "xiaomi-miui-browser", ClientFamilyType.BROWSER, "Xiaomi MIUI Browser", "https://trust.mi.com/docs/miui-privacy-white-paper-global/4/7"),
    SAMSUNG_BROWSER(16, "samsung-browser", ClientFamilyType.BROWSER, "Samsung Browser", "https://browser.samsung.com/"),
    ANDROID_WEBVIEW(17, "android-webview", ClientFamilyType.WEBVIEW, "Android WebView", "https://developer.android.com/reference/android/webkit/WebView"),
    SPEEDCURVE_BOT(18, "speedcurve-bot", ClientFamilyType.BOT, "SpeedCurve Speedtester Bot", "https://www.speedcurve.com/"),
    BING_BOT(19, "bing-bot", ClientFamilyType.BOT, "Microsoft Bing Bot", "https://www.microsoft.com/en-us/bing"),
    IUBENDA_RADAR_BOT(20, "iubenda-radar-bot", ClientFamilyType.BOT, "Iubenda Radar Bot", "https://www.iubenda.com/"),
    BITSIGHT_BOT(21, "bitsight-bot", ClientFamilyType.BOT, "BitSight Bot", "https://www.bitsight.com/"),
    GOOGLE_SEARCH_APP(22, "google-search-app", ClientFamilyType.APP, "Google Search App", "https://search.google/google-app/"),
    BAIDU_SPIDER_BOT(23, "baidu-spider-bot", ClientFamilyType.BOT, "Baidu Spider Bot", "https://www.baidu.com/search/spider.htm"),
    INSTAGRAM_APP(24, "instagram-app", ClientFamilyType.APP, "Instagram App", "https://www.instagram.com/"),
    WEBKIT_BROWSER(25, "webkit-browser", ClientFamilyType.WEBVIEW, "WebKit Browser", "https://webkit.org/"),
    SOGOU_WEB_SPIDER_BOT(26, "sogou-web-spider-bot", ClientFamilyType.BOT, "Sogou Web Spider Bot", "https://www.sogou.com/"),
    WECHAT_APP(27, "wechat-app", ClientFamilyType.APP, "WeChat App", "https://www.wechat.com/"),
    TIKTOK_APP(28, "tiktok-app", ClientFamilyType.APP, "TikTok App", "https://www.tiktok.com/en/"),
    VIVO_BROWSER(29, "vivo-browser", ClientFamilyType.BROWSER, "Vivo Browser", "https://www.vivo.com/"),
    YANDEX_SEARCH_BOT(30, "yandex-search-bot", ClientFamilyType.BOT, "Yandex Search Bot", "https://yandex.com/"),
    DATAPROVIDER_BOT(31, "dataprovider-bot", ClientFamilyType.BOT, "Dataprovider.com Bot", "https://www.dataprovider.com/"),
    ELECTRON_WEBVIEW(32, "electron-webview", ClientFamilyType.WEBVIEW, "Electron WebView", "https://www.electronjs.org/"),
    SEBOT_WA_BOT(33, "sebot-wa-bot", ClientFamilyType.BOT, "SEBot-WA", ""),
    OPERA_TOUCH(34, "opera-touch", ClientFamilyType.BROWSER, "Opera Touch", "https://www.opera.com/mobile/touch"),
    CHROME_HEADLESS(35, "chrome-headless", ClientFamilyType.BOT, "Chrome (Headless)", "https://developer.chrome.com/docs/chromium/headless"),
    YAHOO_JAPAN_APP(36, "yahoo-japan-app", ClientFamilyType.APP, "Yahoo Japan App", "https://promo-mobile.yahoo.co.jp/yjapp/"),
    ABEVALBOT_BOT(37, "abevalbot-bot", ClientFamilyType.BOT, "ABEvalBot", ""),
    META_QUEST_BROWSER(38, "meta-quest-browser", ClientFamilyType.BROWSER, "Meta Quest Browser", "https://www.meta.com/en-gb/experiences/browser/1916519981771802/"),
    QUILLBOT_BOT(39, "quillbot-bot", ClientFamilyType.BOT, "Quillbot Bot", "https://quillbot.com/"),
    YISOUSPIDER_BOT(40, "yisouspider-bot", ClientFamilyType.BOT, "YisouSpider Web Crawler Bot", "https://zhanzhang.sm.cn/"),
    OPERA_GX(41, "opera-gx", ClientFamilyType.BROWSER, "Opera GX", "https://www.opera.com/gx/gx-browser"),
    NEWSAI_BOT(42, "newsai-bot", ClientFamilyType.BOT, "NewsAI Bot", "https://www.newsai.me/"),
    ULTRALIGHT_APP(43, "ultralight-app", ClientFamilyType.APP, "Ultralight Photo Video Editor App", "https://www.ultralightapp.com/"),
    INTERNET_EXPLORER(44, "internet-explorer", ClientFamilyType.BROWSER, "Internet Explorer", "https://support.microsoft.com/en-us/windows/internet-explorer-downloads-d49e1f0d-571c-9a7b-d97e-be248806ca70"),
    EXPO_RESEARCH_BOT(45, "expo-research-bot", ClientFamilyType.BOT, "Expo React Native Bot", "https://www.expoaichatbot.com/"),
    DUCKDUCKGO_BROWSER(46, "duckduckgo-browser", ClientFamilyType.BROWSER, "DuckDuckGo Browser", "https://duckduckgo.com/"),
    SNAPCHAT_APP(47, "snapchat-app", ClientFamilyType.APP, "Snapchat App", "https://www.snapchat.com/"),
    SRWARE_IRON_BROWSER(48, "srware-iron-browser", ClientFamilyType.BROWSER, "SRWare Iron Browser", "https://www.srware.net/iron/"),
    STREAMLABS_DESKTOP(49, "streamlabs-desktop", ClientFamilyType.APP, "Streamlabs Desktop", "https://streamlabs.com/"),
    GOOGLE_GEMINI_APP(50, "google-gemini-app", ClientFamilyType.APP, "Google Gemini App", "https://gemini.google.com/"),
    META_BROWSER(51, "meta-browser", ClientFamilyType.APP, "Meta Browser", "https://www.meta.com/"),
    AVAST_SECURE_BROWSER(52, "avast-secure-browser", ClientFamilyType.BROWSER, "Avast Secure Browser", "https://www.avast.com/"),
    HEYTAP_BROWSER(53, "heytap-browser", ClientFamilyType.BROWSER, "HeyTap Browser", "https://www.heytap.com/"),
    META_EXTERNALAGENT_BOT(54, "meta-externalagent-bot", ClientFamilyType.BOT, "Meta-ExternalAgent Bot", "https://developers.facebook.com/docs/sharing/webmasters/web-crawlers/"),
    AMAZON_BEDROCK_AGENTCORE_BROWSER(55, "amazon-bedrock-agentcore-browser", ClientFamilyType.BOT, "Amazon Bedrock AgentCore Browser", "https://docs.aws.amazon.com/bedrock-agentcore/latest/devguide/browser-tool.html"),
    OKX_DOLPHIN_CRAWLER_BOT(56, "okx-dolphin-crawler-bot", ClientFamilyType.BOT, "OKX Dolphin Crawler Bot", "https://www.okx.com/"),
    ECOSIA_SEARCH_ENGINE(57, "ecosia-search-engine", ClientFamilyType.BROWSER, "Ecosia Search Engine", "https://www.ecosia.org/"),
    SIMPLEANALYTICS_BOT(58, "simpleanalytics-bot", ClientFamilyType.BOT, "SimpleAnalytics Bot", "https://docs.simpleanalytics.com/bots"),
    HUAWEI_BROWSER(59, "huawei-browser", ClientFamilyType.BROWSER, "Huawei Browser", "https://consumer.huawei.com/en/mobileservices/browser/"),
    VALVE_STEAM_CLIENT(60, "valve-steam-client", ClientFamilyType.APP, "Valve Steam Client", "https://help.steampowered.com/en/faqs/view/3978-072C-18DF-FBF9"),
    GOOGLE_STOREBOT(61, "google-storebot", ClientFamilyType.BOT, "Google StoreBot Crawler", "https://support.google.com/merchants/answer/13294660?hl=en"),
    AMAZON_WEBVIEW(62, "amazon-webview", ClientFamilyType.WEBVIEW, "Amazon Cordova WebView", "https://github.com/apache/cordova-amazon-fireos"),
    BOT_SEEKPORT(63, "bot-seekport", ClientFamilyType.BOT, "Seekport Bot", "https://bot.seekport.com/"),
    OBS_STUDIO_STREAMLABS(64, "obs-studio-streamlabs", ClientFamilyType.APP, "OBS Studio Streamlabs", "https://streamlabs.com/"),
    BOT_LINKEDIN(65, "bot-linkedin", ClientFamilyType.BOT, "LinkedIn Bot", "https://www.linkedin.com"),
    APP_WECHAT(66, "app-wechat", ClientFamilyType.APP, "WeChat App", "https://www.wechat.com/en"),
    BOT_SHAPBOT(67, "bot-shapbot", ClientFamilyType.BOT, "ShapBot", "https://docs.parallel.ai/resources/crawler"),
    QIHOO_360_SPIDER_BOT(68, "qihoo-360-spider-bot", ClientFamilyType.BOT, "Qihoo 360 Spider Bot", "https://www.so.com/"),
    DOUBAO_APP(69, "doubao-app", ClientFamilyType.APP, "Doubao App", "https://www.doubao.com/"),
    HIBROWSER(70, "hibrowser", ClientFamilyType.BROWSER, "HiBrowser", "https://play.google.com/store/apps/details?id=com.hisense.odinbrowser&hl=en&pli=1"),
    AVG_SECURE_BROWSER(71, "avg-secure-browser", ClientFamilyType.BROWSER, "AVG Secure Browser", "https://www.avg.com/"),
    OBS_STUDIO_APP(72, "obs-studio-app", ClientFamilyType.APP, "OBS Studio", "https://obsproject.com/"),
    VALVE_STEAM_GAMEPAD_APP(73, "valve-steam-gamepad-app", ClientFamilyType.APP, "Valve Steam Gamepad UI", "https://help.steampowered.com/en/faqs/view/3978-072C-18DF-FBF9");

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
    private final ClientFamilyType type;
    private final String name;
    private final String url;

    ClientFamily(int id, String slug, ClientFamilyType type, String name, String url) {
        this.id = id;
        this.slug = slug;
        this.type = type;
        this.name = name;
        this.url = url;
    }

    public int getID() {
        return this.id;
    }

    public String getSlug() {
        return this.slug;
    }

    public ClientFamilyType getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

    public String getURL() {
        return this.url;
    }

}
