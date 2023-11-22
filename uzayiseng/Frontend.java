class Frontend {
public static void main(String[] args) {
    Language java = new Language();

    java.connectServer();
    java.responsive(java.language);
  }

}interface Backend {
  public void connectServer();
}


  public void responsive(String str) {
    System.out.println(str + " can also be used as frontend.");
  }
}

// Language extends Frontend class
// Language implements Backend interface
class Language extends Frontend implements Backend {

  String language = "Java";

  // implement method of interface
  public void connectServer() {
    System.out.println(language + " can be used as backend language.");
  }

  