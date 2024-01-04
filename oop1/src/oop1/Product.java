package oop1;

public class Product {

    private String name;
    private String imageUrl;
    private Integer unitsInStock;
    private double unitPrice;
    private double discount;

        // Getter methods
        public String getName() {
            return name;
        }
    
        public String getImageUrl() {
            return imageUrl;
        }
    
        public Integer getUnitsInStock() {
            return unitsInStock;
        }
    
        public double getUnitPrice() {
            return unitPrice;
        }
    
        public double getDiscount() {
            return discount;
        }
    
        // Setter methods
        public void setName(String name) {
            this.name = name;
        }
    
        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }
    
        public void setUnitsInStock(Integer unitsInStock) {
            this.unitsInStock = unitsInStock;
        }
    
        public void setUnitPrice(double unitPrice) {
            this.unitPrice = unitPrice;
        }
    
        public void setDiscount(double discount) {
            this.discount = discount;
        }
    

}