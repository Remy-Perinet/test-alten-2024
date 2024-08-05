import { Injectable } from "@angular/core";
import Product from "../entities/Products";

const baseUrl = 'http://localhost:5000';

@Injectable({providedIn: 'root'})
export class ProductsService {
  public products : Array<Product> = [];
  constructor(){};


  async getAllProducts(){
    const url = `${baseUrl}/products`;  
    const results = await fetch(url)
      .then(res => res.json())
    this.products = results;
  }
  
  private async addProducts(products: Array<Product>){
    const url = `${baseUrl}/products`;
    const results = await fetch(url, {
      method: "POST",
      body: JSON.stringify(products),
      headers: {
        "Content-Type": "application/json",
      },
    }).then(res => res.json())
    this.products = [...this.products, ...results]
  }

  async updateOrCreateProduct(product: Product){
    console.log(product)
    if(product.id){
      const url = `${baseUrl}/product/${product.id}`
      const result = await fetch(url, {
        method: "PATCH",
        body: JSON.stringify(product),
        headers: {
          "Content-Type": "application/json",
        },
      }).then(res => res.json())
      const index = this.products.findIndex(prod => prod.id === product.id);
      this.products[index] = result;
      
    } else {
      this.addProducts([product])
    }
  }

  async deleteProducts(ids){
    if(ids && ids.length > 0){
      const prom = ids.map(id => {
        const url = `${baseUrl}/product/${id}`;
        return fetch(url, {
          method: "DELETE",
        })
          .then( res => {
            if(res.status === 200){
              const temp = structuredClone(this.products);
              const index = temp.findIndex(p => p.id === id);
              temp.splice(index, 1);
              this.products = temp;
            }
        })
      })

      for(const p of prom){
        await Promise.resolve(p);
      }
    }
  }

}