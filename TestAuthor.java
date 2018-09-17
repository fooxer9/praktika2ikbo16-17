/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Дом
 */
public class TestAuthor {
  public static void main (String [] args) {
    Author John = new Author ("John Williams", "johnwill@gmail.com", true);
    System.out.println (John.toString());
    Author Mia = new Author("Mia Goldfish", "miasweetie@gmail.com", false);
    System.out.println (Mia.toString());
  }
}
