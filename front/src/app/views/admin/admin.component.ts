import { Component, OnInit } from "@angular/core";
import { ControlType } from "app/shared/utils/crud-item-options/control-type.model";
import { CrudItemOptions } from "app/shared/utils/crud-item-options/crud-item-options.model";
import Product from "app/shared/utils/entities/Products";
import { ProductsService } from "app/shared/utils/fetch/products.service";

@Component({
  templateUrl: './admin.component.html'
})
export default class AdminComponent {
  public products: Array<Product>;

  constructor(
    public readonly productsService: ProductsService
  ) { }

  ;
  public config: CrudItemOptions[] = [
    {
      key: 'code',
      label: 'code',
      controlType: ControlType.INPUT,
      type: 'text',
      value: 'code',
      columnOptions: {
        sortable: true,
        filterable: true,
        default: true,
        hidden: false,
      },
      controlOptions: {
        hideOnCreate: false,
        disableOnCreate: false,
        disableOnUpdate: true,
        hideOnUpdate: false
      }
    }, {
      key: 'name',
      label: 'name',
      controlType: ControlType.INPUT,
      type: 'text',
      value: 'name',
      columnOptions: {
        sortable: true,
        filterable: true,
        default: true,
        hidden: false,
      },
      controlOptions: {
        hideOnCreate: false,
        disableOnCreate: false,
        disableOnUpdate: false,
        hideOnUpdate: false
      }
    }, {
      key: 'id',
      label: 'id',
      controlType: ControlType.INPUT,
      type: 'number',
      value: 'id',
      columnOptions: {
        sortable: false,
        filterable: false,
        default: false,
        hidden: true,
      },
      controlOptions: {
        hideOnCreate: true,
        disableOnCreate: true,
        disableOnUpdate: true,
        hideOnUpdate: true
      }
    }
  ]
  product() {
    return Product;
  }

}