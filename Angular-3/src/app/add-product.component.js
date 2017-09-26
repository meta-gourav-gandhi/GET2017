"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require("@angular/core");
var common_1 = require("@angular/common");
var product_service_1 = require("./product.service");
var products_component_1 = require("./products.component");
var AddProductComponent = (function () {
    function AddProductComponent(productService, productcomponent, location) {
        this.productService = productService;
        this.productcomponent = productcomponent;
        this.location = location;
    }
    AddProductComponent.prototype.add = function (name, price, seller) {
        var _this = this;
        name = name.trim();
        seller = seller.trim();
        this.productService.create(name, price, seller)
            .then(function (product) {
            _this.productcomponent.products.push(product);
        });
        this.goBack();
    };
    AddProductComponent.prototype.goBack = function () {
        this.location.back();
    };
    return AddProductComponent;
}());
AddProductComponent = __decorate([
    core_1.Component({
        selector: 'add-product',
        templateUrl: './add-product.component.html',
        styleUrls: ['./add-product.component.css']
    }),
    __metadata("design:paramtypes", [product_service_1.ProductService,
        products_component_1.ProductsComponent,
        common_1.Location])
], AddProductComponent);
exports.AddProductComponent = AddProductComponent;
//# sourceMappingURL=add-product.component.js.map