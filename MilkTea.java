public class MilkTea extends Drink{

  //--------------------------------------------------------------------------------------------//
   /* 
    * Instance variables for MilkTea class
    */
  //--------------------------------------------------------------------------------------------//
  
  private String typeOfMilk;
  private boolean isBlended;

  //--------------------------------------------------------------------------------------------//
   /* 
    * constructors for MilkTea class
    */
  //--------------------------------------------------------------------------------------------//
  
  public MilkTea(){
    super();
    isBlended = false;
    typeOfMilk = "Whole Milk";
  }

  public MilkTea(String flavor, String size, boolean hasBoba, String typeOfBoba, boolean isBlended,  String typeOfMilk){
    super(flavor, size, hasBoba, typeOfBoba);
    this.isBlended = isBlended;
    this.typeOfMilk = typeOfMilk;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * return methods for MilkTea class
    */
  //--------------------------------------------------------------------------------------------//
  
  public boolean getIsBlended(){
    return isBlended;
  }

  public String getTypeOfMilk(){
    return typeOfMilk;
  }
  
  //--------------------------------------------------------------------------------------------//
   /* 
    * Mutator methods for MilkTea class
    */
  //--------------------------------------------------------------------------------------------//

  public void setIsBlended(boolean newIsBlended){
    isBlended = newIsBlended;
  }

  public void setTypeOfMilk(String newTypeOfMilk){
    typeOfMilk = newTypeOfMilk;
  }

  //--------------------------------------------------------------------------------------------//
   /* 
    * toString method for MilkTea class
    */
  //--------------------------------------------------------------------------------------------//
  
  public String toString(){
    return super.toString() + "\n" + "Is Blended?: " + isBlended + "\n" + "Type of Milk: " + typeOfMilk;
  }
}