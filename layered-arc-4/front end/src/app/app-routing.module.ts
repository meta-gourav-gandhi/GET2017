import { NgModule } from '@angular/core';
import { RouterModule , Routes } from '@angular/router';

import { ProductsComponent } from './products.component';
import { ProductDetailComponent } from './product-detail.component';
import { DashboardComponent } from './dashboard.component';
import { ProductEditComponent } from './product-edit.component';
import { AddProductComponent } from './add-product.component';
import { ContactUs } from './contactus.component';
import { CartComponent } from './cart.component';

const routes : Routes = [
    {
        path:'products',
        component : ProductsComponent
      },
      {
        path : 'dashboard',
        component : DashboardComponent
      },
      {
        path : '',
        redirectTo : '/dashboard',
        pathMatch : 'full'

      },
      {
        path : 'detail/:id',
        component : ProductDetailComponent
      },
      {
        path : 'edit-product/:id',
        component : ProductEditComponent
      },
      {
        path : 'addProduct',
        component : AddProductComponent
      },
      {
        path : 'contactus',
        component : ContactUs
      },
      {
        path : 'cart',
        component : CartComponent
      }
];

@NgModule({
    imports : [ RouterModule.forRoot(routes) ],
    exports : [ RouterModule ]
})

export class AppRoutingModule{

}