  public class Drink{

  //--------------------------------------------------------------------------------------------//
   /* 
    * Instance variables for the Drink class
    */
  //--------------------------------------------------------------------------------------------//
    
    private String flavor;
    private String size;
    private boolean hasBoba;
    private String typeOfBoba;

  //--------------------------------------------------------------------------------------------//
   /* 
    * Creates the constructor methods for the Drink class
    */
  //--------------------------------------------------------------------------------------------//
    
  public Drink(){
    this("classic", "small", true, "tapioca");
  }

  public Drink(String flavor, String size, boolean hasBoba, String typeOfBoba){
    this.flavor = flavor;
    this.size = size;
    this.hasBoba = hasBoba;
    this.typeOfBoba = typeOfBoba;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * Returns the methods
    */
  //--------------------------------------------------------------------------------------------//
    
  public String getFlavor(){
    return flavor;
  }

  public String getSize(){
    return size;
  }

  public boolean getHasBoba(){
    return hasBoba;
  }

  public String getTypeOfBoba(){
    return typeOfBoba;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * Mutator methods for he Drink class
    */
  //--------------------------------------------------------------------------------------------//
    
  public void setFlavor(String newFlavor){
    flavor = newFlavor;
  }

  public void setSize(String newSize){
    size = newSize;
  }

  public void setHasBoba(boolean newHasBoba){
    hasBoba = newHasBoba;
  }

  public void setTypeOfBoba(String newTypeOfBoba){
    typeOfBoba = newTypeOfBoba;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * toString method for Drink Class
    */
  //--------------------------------------------------------------------------------------------//

  public String toString(){
    return "Here's your " + flavor + " drink: " + "\n" + "Size: " + size + "\n" + "Has Boba?: " + hasBoba + "\n" + "What Type of Boba: " + typeOfBoba;
  }
}