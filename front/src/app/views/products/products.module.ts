import { NgModule } from "@angular/core";
import ProductsComponent from "./products.component"
import { SharedModule } from "../../shared/shared.module";

@NgModule({
  declarations: [ProductsComponent],
  imports: [SharedModule]
})
export default class ProductsModule {
  constructor() {

  };
}