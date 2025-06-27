class Order {
    constructor() {
        this.id = undefined;
        this.requesterName = name;
        this.products = [];
    }

    addProduct(product) {
        this.products.push(product);
    }

    createOrder() {
        this.id = new Date().getTime();
        // save in DB
    }
}

class Product {
    constructor(product, productExtra, sidedish, sidedishExtra, beverage, beverageExtra) {
        this.product = product;
        this.productExtra = productExtra;
        this.sidedish = sidedish;
        this.sidedishExtra = sidedishExtra;
        this.beverage = beverage;
        this.beverageExtra = beverageExtra;
        }

    getProduct() {        return {
            product: this.product,
            productExtra: this.productExtra,
            sidedish: this.sidedish,
            sidedishExtra: this.sidedishExtra,
            beverage: this.beverage,
            beverageExtra: this.beverageExtra
        };
    }

    
}
