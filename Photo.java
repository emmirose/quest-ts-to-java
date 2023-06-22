public class Photo {
  private String url;
  private String filename;
  private int width;
  private int height;

  public Photo(String url, String filename, int width, int height) {
    this.url = url;
    this.filename = filename;
    this.width = width;
    this.height = height;
  }

  public String getUrl() {return this.url;}
  public String getFilename() {return this.filename;}
  public int getWidth() {return this.width;}
  public int getHeight() {return this.height;}

  public void setUrl(String url) {this.url = url;}
  public void setFilename(String filename) {this.filename = filename;}
  public void setWidth(int width) {this.width = width;}
  public void setHeight(int height) {this.height = height;}
}
