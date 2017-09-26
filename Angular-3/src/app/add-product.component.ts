import { Component } from '@angular/core';
import { Location } from '@angular/common';

import { Product } from './product';
import { ProductService } from './product.service';
import { ProductsComponent } from './products.component';

@Component({
    selector : 'add-product',
    templateUrl : './add-product.component.html',
    styleUrls : ['./add-product.component.css']
})

export class AddProductComponent{

    constructor (private productService : ProductService,
        private productcomponent : ProductsComponent,
        private location : Location 

    ){}
    
    add(name : string , price : number , seller : string) : void {
        name = name.trim();
        seller = seller.trim();
        
         this.productService.create(name,price,seller)
        .then( product => {
           this.productcomponent.products.push(product);
        } )
        this.goBack();
    }

    goBack() : void{
        this.location.back();
    }
}