package models;

import java.util.Date;


public class ProductDto {
	
	    public String productNo;

	    public String barCode;

	    public String productName;

	    public Float lastPurchasePrice;

	    public Float salePrice;

	    public String imageUrl;

	    public Boolean isChangePrice;

	    public Float qtyOnHand;

	    public String productUnitCode;

	    public String description;

	    public String alias;

	    public Date createdDate;

		public Integer createdBy;
	    
	    public Date updatedDate;

	    public Integer updatedBy;
	    
	    public Boolean isDeleted;
	    
	    public Integer deletedBy;
	    
	    public Boolean isActive;

	    public String otherName;

	    public String sort;
	    
	    public ProductDto(){}
	    
	    public ProductDto(Product p){
	    	this.productNo = p.getProductNo();
		    this.barCode = p.getBarCode();

		    this.productName = p.getProductName();

		    this.lastPurchasePrice = p.getLastPurchasePrice();

		    this.salePrice= p.getSalePrice() ;

		    this.imageUrl= p.getImageUrl() ;

		    this.isChangePrice= p.getIsChangePrice() ;

		    this.qtyOnHand= p.getQtyOnHand() ;

		    this.productUnitCode = p.getProductUnitCode();

		    this.description= p.getDescription() ;

		    this.alias = p.getAlias();

		    this.createdDate= p.getCreatedDate() ;

			this.createdBy = p.getCreatedBy();
		    
		    this.updatedDate= p.getUpdatedDate() ;

		    this.updatedBy= p.getUpdatedBy() ;
		    
		    this.isDeleted = p.getIsDeleted();
		    
		    this.deletedBy= p.getDeletedBy() ;
		    
		    this.isActive= p.getIsActive() ;

		    this.otherName= p.getOtherName() ;

		    this.sort= p.getSort() ;	    	
	    }
}
