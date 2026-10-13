package com.anurag.foodordering;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "food_item")
public class FoodItem {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String category;
    private String imageUrl;
    private Boolean isVeg;
    public Long getId(){return id;} public void setId(Long id){this.id=id;}
    public String getName(){return name;} public void setName(String n){this.name=n;}
    public String getDescription(){return description;} public void setDescription(String d){this.description=d;}
    public Double getPrice(){return price;} public void setPrice(Double p){this.price=p;}
    public String getCategory(){return category;} public void setCategory(String c){this.category=c;}
    public String getImageUrl(){return imageUrl;} public void setImageUrl(String u){this.imageUrl=u;}
    public Boolean getIsVeg(){return isVeg;} public void setIsVeg(Boolean v){this.isVeg=v;}
}