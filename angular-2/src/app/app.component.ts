import { Component } from '@angular/core';
import { Product } from './Product';
import { ProductService} from './product.service';
import { OnInit } from '@angular/core';


@Component({
  selector: 'my-app',
  templateUrl: './product-detail.component.html',
  styleUrls:['./product-detail.component.css'],
  providers:[ProductService]
})


export class AppComponent implements OnInit { 
  title = "List of products";
  products : Product[];
  constructor(private productservice : ProductService){}

  getProduct() : void{
    this.productservice.getProduct().then(products => this.products=products);
  }

  ngOnInit():void{
    this.getProduct();
  }

}

