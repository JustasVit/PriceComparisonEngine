import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ItemGridComponent} from "./components/item-grid/item-grid.component";
import {SearchFieldComponent} from "./components/search-field/search-field.component";

const routes: Routes = [{path:'',component:ItemGridComponent},{path:'search',component:SearchFieldComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
