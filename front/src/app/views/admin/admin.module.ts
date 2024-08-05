import { NgModule } from "@angular/core";
import AdminComponent from "./admin.component"
import { SharedModule } from "../../shared/shared.module";  

@NgModule({
    declarations: [AdminComponent],
    imports: [SharedModule]
})
export default class AdminModule{
    constructor(){

    };
}