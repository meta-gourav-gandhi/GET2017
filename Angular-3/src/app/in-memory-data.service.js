"use strict";
var InMemoryDataService = (function () {
    function InMemoryDataService() {
    }
    InMemoryDataService.prototype.createDb = function () {
        var products = [
            { id: 11, name: 'Tv', price: 80000, seller: 'Gourav', img_url: './app/assets/tv.jpg' },
            { id: 12, name: 'Mobile', price: 7000, seller: 'Gourav', img_url: './app/assets/phone.jpg' },
            { id: 13, name: 'Headphone', price: 10000, seller: 'Gourav', img_url: './app/assets/headphones.png' },
            { id: 14, name: 'Camera', price: 40000, seller: 'Gourav', img_url: './app/assets/camera.jpg' },
            { id: 15, name: 'Speaker', price: 2000, seller: 'Jon Snow', img_url: './app/assets/speakers.png' },
            { id: 16, name: 'Jeans', price: 1000, seller: 'Jon Snow', img_url: './app/assets/jeans.jpg' },
            { id: 17, name: 'Shirts', price: 500, seller: 'Jon Snow', img_url: './app/assets/shirts.jpg' },
            { id: 18, name: 'Shoes', price: 899, seller: 'Jon Snow', img_url: './app/assets/shoes.jpg' },
            { id: 19, name: 'Laptop', price: 40899, seller: 'Jon Snow', img_url: './app/assets/shoes.jpg' }
        ];
        return { products: products };
    };
    return InMemoryDataService;
}());
exports.InMemoryDataService = InMemoryDataService;
//# sourceMappingURL=in-memory-data.service.js.map