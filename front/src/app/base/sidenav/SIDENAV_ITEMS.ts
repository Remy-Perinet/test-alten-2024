import { SidenavItem } from "app/base/sidenav/sidenav.model";

export const SIDENAV_ITEMS: SidenavItem[] = [
  {
    id: 'admin',
    labels: {
      en: "Admin",
      fr: "Admin"
    },
    link: '/admin'

  },
  {
    id: 'products',
    labels: {
      en: "Products",
      fr: "Produits"
    },
    link: '/products'

  }

];