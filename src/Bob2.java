public class Bob2 {
    public static void main(String[] args) {

    }
}

enum BrowserType {
    IE, CHROME, FIREFOX
}

interface Browser {
    void browse(String url);
}

class InternetExplorer implements Browser{

    @Override
    public void browse(String url) {
        // do something
    }
}

class Chrome implements Browser {

    @Override
    public void browse(String url) {
        // do something
    }
}

class Firefox implements Browser {

    @Override
    public void browse(String url) {

    }
}

class WebBrowser {

    private Browser browser;

    public void browse(BrowserType browserType, String url) {
        if(browserType.equals(browserType.IE)) {
            browser = new InternetExplorer();
            browser.browse(url);
        }else if(browserType.equals(browserType.CHROME)) {
            browser = new Chrome();
            browser.browse(url);
        }else if(browserType.equals(BrowserType.FIREFOX)) {
            browser = new Firefox();
            browser.browse(url);
        }
    }
}