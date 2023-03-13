/**
 * 
 */
package projects.entities;

/**
 * @author Promineo
 *
 */
public class Category {
  private Integer catagoryId;
  private String catagoryName;

  public Integer getCategoryId() {
    return catagoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.catagoryId = categoryId;
  }

  public String getCategoryName() {
    return catagoryName;
  }

  public void setCategoryName(String categoryName) {
    this.catagoryName = categoryName;
  }

  @Override
  public String toString() {
    return "ID=" + catagoryId + ", catagoryName= " + catagoryName;
  }
}


/*
public class Category {
  private Integer categoryId;
  private String categoryName;

  public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

  @Override
  public String toString() {
    return "ID=" + categoryId + ", catagoryName= " + categoryName;
  }
}
*/
