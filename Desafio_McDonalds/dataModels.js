class Order {
    constructor(name) {
        this.id = undefined;
        this.requesterName = name;
        this.products = [];
    }

    addProduct(product) {
        this.products.push(product);
    }

    save() {
        this.id = new Date().getTime();
        // save in DB
    }
}

class Product {
    constructor(name, extra) {
        this.name = name;
        if (extra) {
            this.extra = '';
        }
    }


}