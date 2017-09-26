import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { InMemoryWebApiModule } from 'angular-in-memory-web-api';
import { InMemoryDataService }  from './in-memory-data.service';

import { AppComponent }  from './app.component';
import { ProductsComponent } from './products.component';
import { ProductDetailComponent } from './product-detail.component';
import { ProductService } from './product.service'; 
import { DashboardComponent } from './dashboard.component';
import { ProductEditComponent } from './product-edit.component';
import { AddProductComponent } from './add-product.component';
import { ProductSearchComponent } from './product-search.component';
import { ContactUs } from './contactus.component';
import { CartComponent } from './cart.component';
import { CartService } from './cart.service';

import { AppRoutingModule } from './app-routing.module';

@NgModule({
  imports:      [ 
      BrowserModule,
      AppRoutingModule,
      HttpModule,
      FormsModule,
      InMemoryWebApiModule.forRoot(InMemoryDataService)
  ],
  declarations: [ 
    AppComponent, 
    ProductDetailComponent , 
    ProductsComponent,
    DashboardComponent,
    ProductEditComponent,
    AddProductComponent,
    ProductSearchComponent,
    ContactUs,
    CartComponent
  ],
  bootstrap:    [ AppComponent ],
  providers :   [ ProductService , ProductsComponent , CartService]
})



export class AppModule { }
