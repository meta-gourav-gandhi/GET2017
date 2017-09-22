import { Injectable } from '@angular/core';
import { Product } from './Product';
import { products} from './mock-product';


@Injectable()
export class ProductService{
    getProduct(): Promise<Product[]> {
        return Promise.resolve(products);
    }
}