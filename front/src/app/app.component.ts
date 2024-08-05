import { Component, HostBinding, OnInit } from '@angular/core';
import { NavigationEnd, Router } from '@angular/router';
import { filter } from 'rxjs/operators';
import { SidenavService } from 'app/base/sidenav/sidenav.service';
import { LoadingService } from './shared/utils/loading/loading.service';
import { ProductsService } from './shared/utils/fetch/products.service';

const TRANSPARENT_NAV_PAGES = [ 'login' ];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {

  @HostBinding('class.transparent') transparent = false;

  constructor(
    private readonly router: Router,
    private readonly sidenavService: SidenavService,
    private loadingService: LoadingService,
    private productsService: ProductsService
  ) {
   
  }

  get getExpanded(): boolean {
    return this.sidenavService.getExpanded();
  }
  get getPinned(): boolean {
    return this.sidenavService.getPinned();
  }

  ngOnInit(): void {
    this.productsService.getAllProducts();
  }
}
