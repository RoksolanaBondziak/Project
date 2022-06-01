package lesson5;

public class Page {
    private int pageId = 53;
    private String pageName;
    private String URL;

    public String getPageName() {
        return pageName;
    }
    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getURL() {
        return URL;
    }
    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getPageId() {
        return pageId;
    }
//    public void setPageId(int pageId) {
//        this.pageId = pageId;
//    }

//    public Page(String pageName, int PageId, String URL) {
//        this.pageName = pageName;
//        this.URL = URL;
//        this.pageId = pageId;
//    }
    public Page() {
    }

    public void openPage() {
        System.out.println(String.format("Page %s was opened", pageName));
    }

    public void closePage() {
        System.out.println(String.format("Page %s was closed", pageName));
    }

    public void clickButton(String buttonName) {
        System.out.println(String.format("Button %s was clicked", buttonName));
    }
//    public abstract void getDeveloperName();

}
