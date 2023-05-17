package myPackage;
import java.awt.Desktop;
import java.util.HashMap;
import java.util.Random;

public class LinkShortener {
    public static HashMap<String, String> urlMap;
    private Random rand;                                
    private final String domain;

    public LinkShortener(String domain) {
        this.urlMap = new HashMap<>();
        this.rand = new Random();
        this.domain = domain;
    }

    public String shortenUrl(String url) {
        String code = generateCode();
        String shortUrl = "https://" + domain + "/" + code;
        urlMap.put(code, url);
        return shortUrl;
    }

    public String expandUrl(String shortUrl) {
        String[] tokens = shortUrl.split("/");
        String code = tokens[tokens.length - 1];
        return urlMap.get(code);
    }

    private String generateCode() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = rand.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }
        return sb.toString();
    }
    
    public void openLink(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(java.net.URI.create(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
