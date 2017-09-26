"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var http_1 = require("@angular/http");
var forms_1 = require("@angular/forms");
var angular_in_memory_web_api_1 = require("angular-in-memory-web-api");
var in_memory_data_service_1 = require("./in-memory-data.service");
var app_component_1 = require("./app.component");
var products_component_1 = require("./products.component");
var product_detail_component_1 = require("./product-detail.component");
var product_service_1 = require("./product.service");
var dashboard_component_1 = require("./dashboard.component");
var product_edit_component_1 = require("./product-edit.component");
var add_product_component_1 = require("./add-product.component");
var product_search_component_1 = require("./product-search.component");
var contactus_component_1 = require("./contactus.component");
var cart_component_1 = require("./cart.component");
var cart_service_1 = require("./cart.service");
var app_routing_module_1 = require("./app-routing.module");
var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    core_1.NgModule({
        imports: [
            platform_browser_1.BrowserModule,
            app_routing_module_1.AppRoutingModule,
            http_1.HttpModule,
            forms_1.FormsModule,
            angular_in_memory_web_api_1.InMemoryWebApiModule.forRoot(in_memory_data_service_1.InMemoryDataService)
        ],
        declarations: [
            app_component_1.AppComponent,
            product_detail_component_1.ProductDetailComponent,
            products_component_1.ProductsComponent,
            dashboard_component_1.DashboardComponent,
            product_edit_component_1.ProductEditComponent,
            add_product_component_1.AddProductComponent,
            product_search_component_1.ProductSearchComponent,
            contactus_component_1.ContactUs,
            cart_component_1.CartComponent
        ],
        bootstrap: [app_component_1.AppComponent],
        providers: [product_service_1.ProductService, products_component_1.ProductsComponent, cart_service_1.CartService]
    })
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map