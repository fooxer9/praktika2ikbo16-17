public class Author {
  private String name;
  private String email;
  private boolean male;
  public Author (String name, String email, boolean male) {
    this.name = name;
    this.email = email;
    this.male = male;
  } 
  public String getName () {
    return name;
  }
  public String getEmail () {
    return email;
  }
  public boolean getGender () {
    return male;
  }
  public void setEmail (String NewEmail) {
    email = NewEmail;
  }
  public String toString () {
    return getName() + " " + (getGender() ? "(m)" : "(ms)") + " at " + getEmail();
  }
}
