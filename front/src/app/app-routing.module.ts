import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import AdminComponent from './views/admin/admin.component';
import ProductsComponent from './views/products/products.component';

const routes: Routes = [
  {
    path: '', 
    redirectTo: 'products', 
    pathMatch: 'full'
  },
  {
    path: 'admin',
    component: AdminComponent
  },
  {
    path: 'products',
    component: ProductsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' })],
  exports: [RouterModule],
})

export class AppRoutingModule {}
