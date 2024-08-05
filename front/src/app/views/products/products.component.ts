import { Component } from "@angular/core";
import { ProductsService } from "app/shared/utils/fetch/products.service";

@Component({
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.scss']
})
export default class ProductsComponent {
  constructor(
    public readonly productsService: ProductsService
   ){};

}