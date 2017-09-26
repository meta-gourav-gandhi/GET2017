import { Component,Injectable } from '@angular/core';
import { Product } from './Product';
import { ProductService} from './product.service';
import { OnInit } from '@angular/core';
import { CartService } from './cart.service';


@Component({
  selector: 'my-products',
  templateUrl: './products.component.html',
  styleUrls:['./products.component.css'],
  providers:[ProductService , CartService ]
})


export class ProductsComponent implements OnInit { 
  
  products : Product[];
  selectedProduct : Product;
  constructor(
    private productservice : ProductService,
    private cartService : CartService
  ){}

  getProduct() : void{
    this.productservice.getProducts().then(products => this.products=products);
  }

  ngOnInit():void{
    this.getProduct();
  }

  onSelect(product : Product) : void {
    this.selectedProduct = product;
  }

  delete(product : Product) : void{
    this.productservice.delete(product.id)
    .then( ()=> {
      this.products=this.products.filter( p => p !== product );
      if(this.selectedProduct===product){
        this.selectedProduct=null;
      }
    } )
  }

  addToCart(product : Product) : void {
      this.cartService.addProductToCart(product);
      alert("product has been added to the cart");
  }
  

}

