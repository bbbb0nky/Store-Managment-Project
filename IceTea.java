public class IceTea extends Drink{

  //--------------------------------------------------------------------------------------------//
   /* 
    * Instance variables for IceTea class
    */
  //--------------------------------------------------------------------------------------------//
  
  private boolean hasExtraHoney;
  private boolean hasLemon;

  //--------------------------------------------------------------------------------------------//
   /* 
    * constructors for IceTea class
    */
  //--------------------------------------------------------------------------------------------//
  
  public IceTea(){
    super();
    hasExtraHoney = false;
    hasLemon = false;
  }

  public IceTea(String flavor, String size, boolean hasBoba, String typeOfBoba, boolean hasExtraHoney, boolean hasLemon){
    super(flavor, size, hasBoba, typeOfBoba);
    this.hasExtraHoney = hasExtraHoney;
    this.hasLemon = hasLemon;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * methods for IceTea class
    */
  //--------------------------------------------------------------------------------------------//

  public boolean getHasExtraHoney(){
    return hasExtraHoney;
  }
  
  public boolean getHasLemon(){
    return hasLemon;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * mutator methods for IceTea class
    */
  //--------------------------------------------------------------------------------------------//

  public void setHasExtraHoney(boolean newHasExtraHoney){
    hasExtraHoney = newHasExtraHoney;
  }

  public void setHasLemon(boolean newHasLemon){
    hasLemon = newHasLemon;
  }

//--------------------------------------------------------------------------------------------//
   /* 
    * toString method for IceTea class
    */
  //--------------------------------------------------------------------------------------------//

  public String toString(){
    return super.toString() + "\n" + "Has Lemon?: " + hasLemon + "\n" + "Has Extra Honey?: " + hasExtraHoney;
  }
  
}